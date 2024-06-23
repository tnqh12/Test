document.addEventListener('DOMContentLoaded', function() {
  saveScore();
});

// localStorage 가져오기
function saveScore() {
  let getName = urlName('getName');
  let playerScore = localStorage.getItem(getName);

  if (getName && playerScore !== null) {
      document.getElementById('getName').textContent = getName;
      document.getElementById('playerScore').textContent = playerScore;
  }
}

// 확인 버튼
document.getElementById('confirmBtn').addEventListener('click', function() {
  window.location.assign("jsquiz1.html");
});

function urlName(name, url) {
  if (!url) url = window.location.href;
  let params = new URLSearchParams(new URL(url).search);
  return params.get(name);
}
