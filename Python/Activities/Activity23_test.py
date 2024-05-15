import pytest


def test_sum(numlist):
    result = sum(numlist, 0)
    assert result == 55
    print("Assert is successful")