"""Calculate some grade statistics"""
grades = [100, 100, 90, 40, 80, 100, 85, 70, 90, 65, 90, 85, 50.5]

def print_grades(grades_input):
  print("Student grades are:")
  for grade in grades_input:
    print(grade)

def grades_sum(scores):
  total = 0
  for score in scores: 
    total += score
  return total
    
def grades_average(grades_input):
  sum_of_grades = grades_sum(grades_input)
  average = sum_of_grades / float(len(grades_input))
  return average

def grades_variance(scores):
  variance = 0
  for score in scores:
    variance += (grades_average(scores) - score) ** 2
    result = variance/len(scores)
  return result



def grades_std_deviation(variance):
  return variance ** 0.5

def grade_stats(grades):
  variance = grades_variance(grades)
  print_grades(grades)
  print("Grade sum is " + str(grades_sum(grades)))
  print("Grade average is " + str(grades_average(grades)))
  print("Grade variance is " + str(variance))
  print("Grade standard deviation is " + str(grades_std_deviation(variance)))

grade_stats(grades)

"""CodeAcademy puzzles and solutions.
1. Define a function is_even that will take a number x as input.
If x is even, then return True.
Otherwise, return False."""
def is_even(x):
  if x%2 == 0:
    return True
  else:
    return False

"""2. Define a function is_int that takes a number x as an input.
Have it return True if the number is an integer (as defined above)
and False otherwise."""
import math
def is_int(x):
  if type(x) == int or int(x) - float(x) == 0:
    return True
  else:
    return False

"""3. Write a function called digit_sum that takes a positive
integer n as input and returns the sum of all that number’s digits.
For example: digit_sum(1234) should return 10 which is 1 + 2 + 3 + 4.
(Assume that the number you are given will always be positive.)"""
def digit_sum(n):
  total = 0
  for subString in str(n):
    total += int(subString)
  print(total)
  return total
  

digit_sum(5678)

"""4. Define a function factorial that takes an integer x as input.

Calculate and return the factorial of that number."""
def factorial(x):
  if x == 1:
    return 1
  elif x > 1:
    print(x * factorial(x-1))
    return x * factorial(x-1)

"""5. Define a function called is_prime that takes a number x as input.

For each number n from 2 to x - 1, test if x is evenly divisible by n.

If it is, return False.

If none of them are, then return True."""
def is_prime(x):
  if x < 2:
    print(False)
    return False
  else:
    for n in range(2, x-1):
      if x % n == 0:
        print(False)
        return False
    print(True)
    return True

is_prime(5)

factorial(4)

"""6. Define a function called reverse that takes a string textand returns
that string in reverse. For example: reverse("abcd") should return "dcba".

You may not use reversed or [::-1] to help you with this.

You may get a string containing special characters (for example, !, @, or #)."""
def reverse(text):
  length = len(text)
  new_text = []
  for i in range(length):
    new_text.append(text[length-1])
    length -= 1
  printed_text = "".join(new_text)
  print(printed_text)
  return printed_text

reverse('hello')

"""7. Define a function called anti_vowel that takes one string, text,
as input and returns the text with all of the vowels removed.

For example: anti_vowel("Hey You!") should return "Hy Y!".
Don’t count Y as a vowel. Make sure to remove lowercase and uppercase vowels."""
def anti_vowel(text):
  newString = []
  length = len(text)
  for i in range(0, length):
    if text[i] not in "AaEeIiOoUu":
      newString.append(text[i])
    length -= 1
  printed_string = "".join(newString)
  print(printed_string)
  return printed_string

anti_vowel("This took too long")

"""8. Scrabble is a game where players get points by spelling words.
Words are scored by adding together the point values of each individual
letter (we’ll leave out the double and triple letter and word scores for now).

To the right is a dictionary containing all of the letters in the alphabet
with their corresponding Scrabble point values.

For example: the word "Helix" would score 15 points due to the sum of
the letters: 4 + 1 + 1 + 1 + 8.

Instructions
Define a function scrabble_score that takes a string word as input
and returns the equivalent scrabble score for that word.

Assume your input is only one word containing no spaces or punctuation.
As mentioned, no need to worry about score multipliers!
Your function should work even if the letters you get are uppercase,
lowercase, or a mix.
Assume that you’re only given non-empty strings."""
score = {"a": 1, "c": 3, "b": 3, "e": 1, "d": 2, "g": 2, 
         "f": 4, "i": 1, "h": 4, "k": 5, "j": 8, "m": 3, 
         "l": 1, "o": 1, "n": 1, "q": 10, "p": 3, "s": 1, 
         "r": 1, "u": 1, "t": 1, "w": 4, "v": 4, "y": 4, 
         "x": 8, "z": 10}

def scrabble_score(word):
  points = 0
  new_word = word.lower() #Make lowercase so all entries work
  for letter in new_word:
    for key in score: #letter in new_word loops through the keys in score
      if letter == key:
        points += score[key]
  print(points)
  return points

scrabble_score("Zoo")

"""9. Write a function called censor that takes two strings,
text and word, as input. It should return the text with the word you chose
replaced with asterisks. Assume your input strings won’t
contain punctuation or upper case letters.
The number of asterisks you put should correspond to
the number of letters in the censored word."""

def censor(text, word):
    words = text.split()
    result = ''
    stars = '*' * len(word)
    count = 0
    for i in words:
        if i == word:
            words[count] = stars
        count += 1
    result =' '.join(words)

    return result
  
print censor("what the hey, hey", "hey")

