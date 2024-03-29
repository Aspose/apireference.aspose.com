---
title: SetFlat
second_title: Aspose.PDF for Java API Reference
description: Class representing i operator set flatness toleracne.
type: docs
weight: 70
url: /java/com.aspose.pdf.operators/setflat/
---
**Inheritance:**
java.lang.Object, [com.aspose.pdf.Operator](../../com.aspose.pdf/operator)
```
public class SetFlat extends Operator
```

Class representing i operator (set flatness toleracne).
## Constructors

| Constructor | Description |
| --- | --- |
| [SetFlat(double flatness)](#SetFlat-double-) | Initializes operator. |
| [SetFlat(int index, ICommand command)](#SetFlat-int-com.aspose.pdf.engine.commondata.pagecontent.operators.commands.ICommand-) | Constructor for operator class. |
## Methods

| Method | Description |
| --- | --- |
| [getFlatness()](#getFlatness--) | Gets the flatness. |
| [setFlatness(double value)](#setFlatness-double-) | Sets the flatness. |
| [accept(IOperatorSelector visitor)](#accept-com.aspose.pdf.IOperatorSelector-) | Accepts visitor object to process operator. |
### SetFlat(double flatness) {#SetFlat-double-}
```
public SetFlat(double flatness)
```


Initializes operator.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| flatness | double | The value of flatness. |

### SetFlat(int index, ICommand command) {#SetFlat-int-com.aspose.pdf.engine.commondata.pagecontent.operators.commands.ICommand-}
```
public SetFlat(int index, ICommand command)
```


Constructor for operator class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index of operator. |
| command | [ICommand](../../com.aspose.pdf.engine.commondata.pagecontent.operators.commands/icommand) | Operator command. |

### getFlatness() {#getFlatness--}
```
public double getFlatness()
```


Gets the flatness.

**Returns:**
double - double value
### setFlatness(double value) {#setFlatness-double-}
```
public void setFlatness(double value)
```


Sets the flatness.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | double value |

### accept(IOperatorSelector visitor) {#accept-com.aspose.pdf.IOperatorSelector-}
```
public void accept(IOperatorSelector visitor)
```


Accepts visitor object to process operator.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| visitor | [IOperatorSelector](../../com.aspose.pdf/ioperatorselector) | Visitor object. |

