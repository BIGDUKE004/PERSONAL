import unittest
import even

class TestEven(unittest.TestCase):

    def test_look_for_even_number(self):
        result = even.look_for_even_number(20)
        self.assertTrue(result)
        
