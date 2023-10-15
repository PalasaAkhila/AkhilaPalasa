function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const inputSentence = "Coding Assignment by Cloud Vandana";
const reversed = reverseWordsInSentence(inputSentence);
console.log(reversed); 


