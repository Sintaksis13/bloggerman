function setUpRecentWords() {
    let recentWordsDiv = document.getElementById("recent-words");
    console.log('hello1');
    let recentWords = async () => {
        console.log('hello2');
        const response = await fetch('http://localhost:8080/dictionary/recent-words');
        const words = await response.json();
        console.log(words)
    }
}