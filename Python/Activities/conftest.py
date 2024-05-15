import pytest

@pytest.fixture()
def numlist():
    my_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return my_list
