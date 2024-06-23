$(document).ready(function() {
    // 퀴즈 리스트
    let qList = [
        { question: "꿈이라는 것을 자각하면서 꾸는 꿈을 무엇이라고 할까요?", answer: "자각몽" },
        { question: "비활성 기체로, 우주에서 수소 다음으로 많이 분포하는 원소는?", answer: "헬륨" },
        { question: "10원짜리 동전 앞 면에 새겨진 탑의 이름은?", answer: "다보탑" },
        { question: "다음 중 “보완하다”라는 의미를 가진 영단어는 무엇일까요?", answer: "Complement" },
        { question: "독일의 수도는?", answer: "베를린" },
        { question: "호주의 수도는?", answer: "캔버라" },
        { question: "태국의 수도는", answer: "방콕" },
        { question: "(OX 퀴즈) 거미는 동물이다.", answer: "O" },
        { question: "남편의 형의 배우자를 부르는 호칭은 무엇일까요?", answer: "형님" },
        { question: "그렇다면 남편의 남동생의 배우자를 부르는 호칭은 무엇일까요?", answer: "동서" },
    ];
    
    let Quiz = 0;
    let correct = 0;
    let getName = urlName('getName');
    
    // 퀴즈 리스트 셔플
    function shuffle(array) {
        for (let i = array.length - 1; i > 0; i--) {
            const j = Math.floor(Math.random() * (i + 1));
            [array[i], array[j]] = [array[j], array[i]];
        }
        return array;
    }
    
    qList = shuffle(qList);
    
    // 퀴즈 초기화
    function Quizreset() {
        DenoteQuiz();
        $('#quizBtn').click(function() {
            $('#answerdiv').css('display', 'flex');
            $('#quizBtn').hide();
            $('#skipBtn').show();
            $('#jquser').hide();
            $('#jq2user').show();
        });
    }
    
    // 다음 문제로
    function nextQuiz() {
        Quiz++;
        if (Quiz < qList.length) {
            $('#answerdiv').hide();
            $('#quizBtn').show();
            $('#skipBtn').hide();
            DenoteQuiz();
            $('#jq2user').hide();
            $('#jquser').show();
        } else {
            endGame();
        }
    }
    
    // 문제 표시
    function DenoteQuiz() {
        var questionElement = $('#question');
        questionElement.text('Q: ' + qList[Quiz].question);
        $('#answertxt').val('');
    }
    
    // 제출 버튼
    $('#answerbtn').click(function() {
        let userAnswer = $('#answertxt').val();
        if (userAnswer.trim().toLowerCase() === qList[Quiz].answer.toLowerCase()) {
            correct++;
            Swal.fire({
                icon: "success",
                title: "정답입니다!"
            }).then(() => {
                nextQuiz();
            });
        } else {
            Swal.fire({
                icon: "error",
                title: "틀렸습니다!"
            }).then(() => {
                nextQuiz();
            });
        }
    });
    
    // 건너뛰기
    $('#skipBtn').click(function() {
        nextQuiz();
    });
    
    // localStorage에 점수 저장
    function saveScore(getName, score) {
        localStorage.setItem(getName, score);
    }
    
    // 퀴즈 완료
    async function endGame() {
        await Swal.fire({
            title: "모든 문제를 풀었습니다!"
        });
        let playerScore = correct;
        saveScore(getName, playerScore);
        window.location.assign(`jsquiz3.html?getName=${getName}`);
    }
    
    // URL에서 파라미터 가져오기 
    //https://www.daleseo.com/js-url-search-params/
    function urlName(name, url) {
        if (!url) url = window.location.href;
        let params = new URLSearchParams(new URL(url).search);
        return params.get(name);
    }
    
    Quizreset();
});
