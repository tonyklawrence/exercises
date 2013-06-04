# Exercise

A junior trader requires a tool to display the value of a Vanilla Option at a given point in time. To do so, he needs a library that you will be developing.

The only parameters to be considered in this simplified model for the valuation are spot price and strike price.


## Definitions

The plain vanilla option is the most traded option. There are two types of vanilla options, `Call` and `Put` Options.

`Call` Options give the owner the right to buy the underlying for a fixed price `K` (the strike) at expiration.

The value of this option is thus `S - K` when the stock's spot price `S` is above the strike `K`, and `0` otherwise.

`Put` Options give the owner the right to sell the underlying for a fixed price.

This option has a value of `K - S` when the stock's spot price is below the strike `K`, and `0` otherwise.


## Relevant Equations

The value equations for this option are given by:

    Call(t) = max(S(t) - K, 0)
     Put(t) = max(K - S(t), 0)


## Example Data

       t: [ 0, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ]
    S(t): [ 100, 102, 97, 90, 77, 65, 66, 80, 87, 100, 103, 105, 115, 112, 100, 105, 117, 120, 112, 102 ]
       K: 80

![](example-data.png)

## Resources

[http://www.investopedia.com/terms/o/option.asp](http://www.investopedia.com/terms/o/option.asp)

