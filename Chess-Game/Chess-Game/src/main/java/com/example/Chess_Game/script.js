document.addEventListener("DOMContentLoaded", () => {
    fetch('/api/chess/board')
        .then(response => response.json())
        .then(data => {
            const board = data.board;
            const boardDiv = document.getElementById('chess-board');
            boardDiv.innerHTML = '';

            for (let i = 0; i < 8; i++) {
                for (let j = 0; j < 8; j++) {
                    const square = document.createElement('div');
                    square.className = (i + j) % 2 === 0 ? 'white' : 'black';
                    square.textContent = board[i][j] || '';
                    boardDiv.appendChild(square);
                }
            }
        });
});