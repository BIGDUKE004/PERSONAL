import unittest
import even.py

class TestEvenNumbers(unittest.TestCase):

    def test_for_even_number(self):
        self.assertTrue(look_even_number(20))
        self.assertTrue(look_even_number(56))
        self.assertTrue(look_even_number(199))

