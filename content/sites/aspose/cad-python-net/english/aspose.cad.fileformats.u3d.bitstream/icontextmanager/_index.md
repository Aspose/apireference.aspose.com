---
title: IContextManager class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /aspose.cad.fileformats.u3d.bitstream/icontextmanager/
is_root: false
---

## IContextManager class

IContextManager.cs 

This file defines the IContextManager interface. 
IContextManager is used to access the static and dynamic contexts used 
for the reading and writing of compressed data.



The IContextManager type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [add_symbol](/cad/python-net/aspose.cad.fileformats.u3d.bitstream/icontextmanager/add_symbol/#int-int) | Add an occurance of the symbol to the specified <br/>context. |
| [get_symbol_frequency](/cad/python-net/aspose.cad.fileformats.u3d.bitstream/icontextmanager/get_symbol_frequency/#int-int) | Get the number of occurrences of the given symbol <br/>in the context. |
| [get_cumulative_symbol_frequency](/cad/python-net/aspose.cad.fileformats.u3d.bitstream/icontextmanager/get_cumulative_symbol_frequency/#int-int) | Get the total number of occurrences for all of the <br/>symbols that are less than the given symbol in the context. |
| [get_total_symbol_frequency](/cad/python-net/aspose.cad.fileformats.u3d.bitstream/icontextmanager/get_total_symbol_frequency/#int) | Get the total occurrences of all the symbols in this <br/>context. |
| [get_symbol_from_frequency](/cad/python-net/aspose.cad.fileformats.u3d.bitstream/icontextmanager/get_symbol_from_frequency/#int-int) | Find the symbol in a histogram that has <br/>the cumulative frequency specified. |



### Remarks 


Dynamic Context: dynamic contexts are specified as 0x0001 
through 0x3FFF. Dynamic contexts keep a histogram that stores 
the number of occurrences of symbols that are added through the 
AddSymbol method. 



 Static Context: static contexts are specified as 0x4000 
through 0x7FFF. Static contexts represent histograms where each 
value between 0 and (context - 0x4000) are equally likely. Static 
contexts histograms are not changed by the AddSymbol method. 



 Context 0 or Context8: context 0 is a shortcut to context 
0x40FF which corresponds to values from 0 through 255. 



 When a histogram for a dynamic context is initialized, 
the symbol frequency of the escape symbol is initialized to 1. 



 Symbols larger than 0xFFFF are treated as static. 



 The IContextManager interface is supported by the 
ContextManager class.

### See Also
* module [`aspose.cad.fileformats.u3d.bitstream`](..)
