// The array numbers is already exists. Write only exchange actions here.
val temp = numbers.first()
numbers[0] = numbers[numbers.lastIndex]
numbers[numbers.lastIndex] = temp