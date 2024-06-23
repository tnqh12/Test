$(function(){
  $("#explanation").click(function(){
    Swal.fire('1) START버튼을 누르고 '+'\n'
      + '닉네임 입력후 게임 시작'+'\n\n'
      + '2) 문제가 나오면 Quiz버튼을'+'\n'
      + '누르고 정답을 입력!'+'\n\n'
      +'3) 총 10문제를 풀면'+'\n'
      + ' 점수와 함께 게임 종료');
      window.localStorage.clear();
      //https://inpa.tistory.com/entry/SweetAlert2-%F0%9F%93%9A-%EC%84%A4%EC%B9%98-%EC%82%AC%EC%9A%A9
  });
});


// 랭킹 표시
function Ranking() {
  let rankinglist = $('#rankinglist');
  rankinglist.html('');

  // localStorage에서 가져오기
  let scores = [];
  for (let i = 0; i < localStorage.length; i++) {
    let getName = localStorage.key(i);
    let playerScore = parseInt(localStorage.getItem(getName), 10);
    scores.push({ name: getName, score: playerScore });
  }

 //내림차순 정렬 a,b차이 retune
  scores.sort(function(a, b) {
    return b.score - a.score;
  });

  scores.forEach(function(score, index) {
    let listItem = $('<li>').text((index + 1) + '위 ' + score.name + ' 점수 : ' + score.score);
    rankinglist.append(listItem);
  });
}

//Start 버튼
$('.startbtn1').click(function(){
  (async () => {
      const { value: getName } = await Swal.fire({
          title: '당신의 닉네임을 입력하세요.',
          text: '닉네임은 랭킹에 기록 됩니다.',
          input: 'text',
          inputPlaceholder: '입력'
      });
      if (getName) {
          window.location.assign(`jsquiz2.html?getName=${getName}`);
          //출처: https://mu08.tistory.com/135 [그냥, 일단 써내려가자:티스토리]
      }
  })()
});

Ranking();
//https://hianna.tistory.com/697 <--localStorage 쓰는법