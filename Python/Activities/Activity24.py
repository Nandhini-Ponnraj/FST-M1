import pytest
@pytest.fixture
def wallet_amount():
    wallet_amount = 0
    return wallet_amount

@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18)])
def test_transaction(wallet_amount,earned, spent, expected):
    print("Wallet amount initially ")
    print(wallet_amount)
    wallet_amount += earned
    print("Wallet amount after earning: ")
    print(wallet_amount)
    wallet_amount -= spent
    print("Wallet amount after spent: ")
    print(wallet_amount)
    assert wallet_amount == expected