from unittest import TestCase
import primenumber 

class TestPrimeNumber(TestCase):

    def testThat3IsPrimeNumber(self):  # fixed typo
        is_valid = primenumber.is_prime(3)
        self.assertTrue(is_valid)

    def testThat7IsPrimeNumber(self):
        is_valid = primenumber.is_prime(7)
        self.assertTrue(is_valid)

    def testThat13IsPrimeNumber(self):
        is_valid = primenumber.is_prime(13)
        self.assertTrue(is_valid)

    def testThat17IsPrimeNumber(self):
        is_valid = primenumber.is_prime(17)
        self.assertTrue(is_valid)
