import pytest
def test_sum():
    num1=5
    num2=4
    result= num1+num2
    assert result == 9
    print("Sum of two numbers" +str(result))
def test_difference():
    num1=10
    num2=5
    result=num1-num2
    assert result==5
    print("Difference of two numbers"+str(result))
@pytest.mark.activity
def test_product_activity():
    num1=10
    num2=5
    result=num1*num2
    assert result==50
    print("Product of two numbers" +str(result))

@pytest.mark.activity
def test_quotient():
    num1=10
    num2=5
    result=num1/num2
    assert result==2
    print("Quotient of two numbers"+str(result))