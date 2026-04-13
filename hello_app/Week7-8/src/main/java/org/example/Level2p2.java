package org.example;

public class Level2p2 {bool isLeapYear(int year)
{
    if(year < 1582)
        return false;

    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        return true;

    return false;
}

    int main()
    {
        int year;
        cin >> year;

        if(isLeapYear(year))
            cout << "Leap Year";
        else
            cout << "Not a Leap Year";

        return 0;
    }
}
