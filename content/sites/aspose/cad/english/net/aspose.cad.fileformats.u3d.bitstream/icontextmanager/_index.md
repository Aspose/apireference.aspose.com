---
title: Interface IContextManager
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.U3d.BitStream.IContextManager interface. IContextManager.cs This file defines the IContextManager interface. IContextManager is used to access the static and dynamic contexts used for the reading and writing of compressed data
type: docs
weight: 35010
url: /net/aspose.cad.fileformats.u3d.bitstream/icontextmanager/
---
## IContextManager interface

IContextManager.cs This file defines the IContextManager interface. IContextManager is used to access the static and dynamic contexts used for the reading and writing of compressed data.

```csharp
public interface IContextManager
```

## Methods

| Name | Description |
| --- | --- |
| [AddSymbol](../../aspose.cad.fileformats.u3d.bitstream/icontextmanager/addsymbol/)(uint, uint) | Add an occurance of the symbol to the specified context. |
| [GetCumulativeSymbolFrequency](../../aspose.cad.fileformats.u3d.bitstream/icontextmanager/getcumulativesymbolfrequency/)(uint, uint) | Get the total number of occurrences for all of the symbols that are less than the given symbol in the context. |
| [GetSymbolFrequency](../../aspose.cad.fileformats.u3d.bitstream/icontextmanager/getsymbolfrequency/)(uint, uint) | Get the number of occurrences of the given symbol in the context. |
| [GetSymbolFromFrequency](../../aspose.cad.fileformats.u3d.bitstream/icontextmanager/getsymbolfromfrequency/)(uint, uint) | Find the symbol in a histogram that has the cumulative frequency specified. |
| [GetTotalSymbolFrequency](../../aspose.cad.fileformats.u3d.bitstream/icontextmanager/gettotalsymbolfrequency/)(uint) | Get the total occurrences of all the symbols in this context. |

## Remarks

Dynamic Context: dynamic contexts are specified as 0x0001 through 0x3FFF. Dynamic contexts keep a histogram that stores the number of occurrences of symbols that are added through the AddSymbol method.

Static Context: static contexts are specified as 0x4000 through 0x7FFF. Static contexts represent histograms where each value between 0 and (context - 0x4000) are equally likely. Static contexts histograms are not changed by the AddSymbol method.

Context 0 or Context8: context 0 is a shortcut to context 0x40FF which corresponds to values from 0 through 255.

When a histogram for a dynamic context is initialized, the symbol frequency of the escape symbol is initialized to 1.

Symbols larger than 0xFFFF are treated as static.

The IContextManager interface is supported by the ContextManager class.

### See Also

* namespace [Aspose.CAD.FileFormats.U3d.BitStream](../../aspose.cad.fileformats.u3d.bitstream/)
* assembly [Aspose.CAD](../../)


