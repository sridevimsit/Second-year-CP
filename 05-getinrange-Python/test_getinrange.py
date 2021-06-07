import os,sys
sys.path.insert(0, r'/home/msit/Documents/MSIT2020/second year CP/Second-year-CP/05-getinrange-Python')
#sys.path.append(os.getcwd())
from getinrange import fun_getinrange
import pytest

@pytest.mark.parametrize('check, result',[
    (fun_getinrange(1, 3, 5), 3), (fun_getinrange(4, 3, 5), 4),
    (fun_getinrange(7, 3, 6), 6), (fun_getinrange(6, 5, 3), 5),
    (fun_getinrange(0, 5, 2), 2)
])
def test_fun_getinrange(check, result):
   
    assert check == result

