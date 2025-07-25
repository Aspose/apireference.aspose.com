﻿---
title: GroupCharacterEquationNode
second_title: Aspose.Cells for Node.js via C++ API Reference
description: This class specifies the GroupCharacter function consisting of a character drawn above or below text often with the purpose of visually grouping items.
type: docs
url: /nodejs-cpp/groupcharacterequationnode/
---

## GroupCharacterEquationNode class

This class specifies the Group-Character function, consisting of a character drawn above or below text, often with the purpose of visually grouping items.

```javascript
class GroupCharacterEquationNode extends EquationNode;
```


## Constructors

| Constructor | Description |
| --- | --- |
| [constructor(EquationNode)](#constructor-equationnode-)| Constructs from a parent object convertible to this. |

## Properties

| Property | Type | Description |
| --- | --- | --- |
| [groupChr](#groupChr--)| string | Specifies a symbol(default U+23DF). It is strongly recommended to use attribute ChrType to set accent character. Use this property setting if you cannot find the character you need in a known type. |
| [chrType](#chrType--)| EquationCombiningCharacterType | Specify combining characters by type value. |
| [position](#position--)| EquationCharacterPositionType | This attribute specifies the position of the character in the object |
| [vertJc](#vertJc--)| EquationCharacterPositionType | This attribute, combined with pos of groupChrPr, specifies the vertical layout of the groupChr object. Where pos specifies the position of the grouping character, vertJc specifies the alignment of the object with respect to the baseline. |
| [startIndex](#startIndex--)| number | Readonly. Gets the start index of the characters. |
| [length](#length--)| number | Readonly. Gets the length of the characters. |
| [font](#font--)| Font | Readonly. Returns the font of this object. |
| [textOptions](#textOptions--)| TextOptions | Readonly. Returns the text options. |
| [parentNode](#parentNode--)| EquationNode | Specifies the parent node of the current node |
| [equationType](#equationType--)| EquationNodeType | Readonly. Get the equation type of the current node |

## Methods

| Method | Description |
| --- | --- |
| [getGroupChr()](#getGroupChr--)| <b>@deprecated.</b> Please use the 'groupChr' property instead. Specifies a symbol(default U+23DF). It is strongly recommended to use attribute ChrType to set accent character. Use this property setting if you cannot find the character you need in a known type. |
| [setGroupChr(string)](#setGroupChr-string-)| <b>@deprecated.</b> Please use the 'groupChr' property instead. Specifies a symbol(default U+23DF). It is strongly recommended to use attribute ChrType to set accent character. Use this property setting if you cannot find the character you need in a known type. |
| [getChrType()](#getChrType--)| <b>@deprecated.</b> Please use the 'chrType' property instead. Specify combining characters by type value. |
| [setChrType(EquationCombiningCharacterType)](#setChrType-equationcombiningcharactertype-)| <b>@deprecated.</b> Please use the 'chrType' property instead. Specify combining characters by type value. |
| [getPosition()](#getPosition--)| <b>@deprecated.</b> Please use the 'position' property instead. This attribute specifies the position of the character in the object |
| [setPosition(EquationCharacterPositionType)](#setPosition-equationcharacterpositiontype-)| <b>@deprecated.</b> Please use the 'position' property instead. This attribute specifies the position of the character in the object |
| [getVertJc()](#getVertJc--)| <b>@deprecated.</b> Please use the 'vertJc' property instead. This attribute, combined with pos of groupChrPr, specifies the vertical layout of the groupChr object. Where pos specifies the position of the grouping character, vertJc specifies the alignment of the object with respect to the baseline. |
| [setVertJc(EquationCharacterPositionType)](#setVertJc-equationcharacterpositiontype-)| <b>@deprecated.</b> Please use the 'vertJc' property instead. This attribute, combined with pos of groupChrPr, specifies the vertical layout of the groupChr object. Where pos specifies the position of the grouping character, vertJc specifies the alignment of the object with respect to the baseline. |
| [isNull()](#isNull--)| Checks whether the implementation object is null. |
| [getStartIndex()](#getStartIndex--)| <b>@deprecated.</b> Please use the 'startIndex' property instead. Gets the start index of the characters. |
| [getLength()](#getLength--)| <b>@deprecated.</b> Please use the 'length' property instead. Gets the length of the characters. |
| [getFont()](#getFont--)| <b>@deprecated.</b> Please use the 'font' property instead. Returns the font of this object. |
| [getTextOptions()](#getTextOptions--)| <b>@deprecated.</b> Please use the 'textOptions' property instead. Returns the text options. |
| [setWordArtStyle(PresetWordArtStyle)](#setWordArtStyle-presetwordartstyle-)| Sets the preset WordArt style. |
| [getParentNode()](#getParentNode--)| <b>@deprecated.</b> Please use the 'parentNode' property instead. Specifies the parent node of the current node |
| [setParentNode(EquationNode)](#setParentNode-equationnode-)| <b>@deprecated.</b> Please use the 'parentNode' property instead. Specifies the parent node of the current node |
| [getEquationType()](#getEquationType--)| <b>@deprecated.</b> Please use the 'equationType' property instead. Get the equation type of the current node |
| [toLaTeX()](#toLaTeX--)| Convert this equtation to LaTeX expression. |
| [toMathML()](#toMathML--)| Convert this equtation to MathML expression. |
| [addChild(EquationNodeType)](#addChild-equationnodetype-)| Insert a node of the specified type at the end of the child node list of the current node. |
| [addChild(EquationNode)](#addChild-equationnode-)| Inserts the specified node at the end of the current node's list of child nodes. |
| [insertChild(number, EquationNodeType)](#insertChild-number-equationnodetype-)| Inserts a node of the specified type at the specified index position in the current node's child node list. |
| [insertAfter(EquationNodeType)](#insertAfter-equationnodetype-)| Inserts the specified node after the current node. |
| [insertBefore(EquationNodeType)](#insertBefore-equationnodetype-)| Inserts the specified node before the current node. |
| [getChild(number)](#getChild-number-)| Returns the node at the specified index among the children of the current node. |
| [remove()](#remove--)| Removes itself from the parent. |
| [removeChild(EquationNode)](#removeChild-equationnode-)| Removes the specified node from the current node's children. |
| [removeChild(number)](#removeChild-number-)| Removes the node at the specified index from the current node's children. |
| [removeAllChildren()](#removeAllChildren--)| Removes all the child nodes of the current node. |
| static [createNode(EquationNodeType, Workbook, EquationNode)](#createNode-equationnodetype-workbook-equationnode-)| Create a node of the specified type. |
| [equals(Object)](#equals-object-)| Determine whether the current equation node is equal to the specified node |
| [getType()](#getType--)| Represents the type of the node. |


### constructor(EquationNode) {#constructor-equationnode-}

Constructs from a parent object convertible to this.

```javascript
constructor(obj: EquationNode);
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | EquationNode | The parent object. |

### groupChr {#groupChr--}

Specifies a symbol(default U+23DF). It is strongly recommended to use attribute ChrType to set accent character. Use this property setting if you cannot find the character you need in a known type.

```javascript
groupChr : string;
```


**Remarks**

It should be noted that this property only accepts one character, and if multiple characters are passed in, only the first character is accepted.

### chrType {#chrType--}

Specify combining characters by type value.

```javascript
chrType : EquationCombiningCharacterType;
```


### position {#position--}

This attribute specifies the position of the character in the object

```javascript
position : EquationCharacterPositionType;
```


### vertJc {#vertJc--}

This attribute, combined with pos of groupChrPr, specifies the vertical layout of the groupChr object. Where pos specifies the position of the grouping character, vertJc specifies the alignment of the object with respect to the baseline.

```javascript
vertJc : EquationCharacterPositionType;
```


### startIndex {#startIndex--}

Readonly. Gets the start index of the characters.

```javascript
startIndex : number;
```


### length {#length--}

Readonly. Gets the length of the characters.

```javascript
length : number;
```


### font {#font--}

Readonly. Returns the font of this object.

```javascript
font : Font;
```


### textOptions {#textOptions--}

Readonly. Returns the text options.

```javascript
textOptions : TextOptions;
```


### parentNode {#parentNode--}

Specifies the parent node of the current node

```javascript
parentNode : EquationNode;
```


### equationType {#equationType--}

Readonly. Get the equation type of the current node

```javascript
equationType : EquationNodeType;
```


### getGroupChr() {#getGroupChr--}

<b>@deprecated.</b> Please use the 'groupChr' property instead. Specifies a symbol(default U+23DF). It is strongly recommended to use attribute ChrType to set accent character. Use this property setting if you cannot find the character you need in a known type.

```javascript
getGroupChr() : string;
```


**Remarks**

It should be noted that this property only accepts one character, and if multiple characters are passed in, only the first character is accepted.

### setGroupChr(string) {#setGroupChr-string-}

<b>@deprecated.</b> Please use the 'groupChr' property instead. Specifies a symbol(default U+23DF). It is strongly recommended to use attribute ChrType to set accent character. Use this property setting if you cannot find the character you need in a known type.

```javascript
setGroupChr(value: string) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | string | The value to set. |

**Remarks**

It should be noted that this property only accepts one character, and if multiple characters are passed in, only the first character is accepted.

### getChrType() {#getChrType--}

<b>@deprecated.</b> Please use the 'chrType' property instead. Specify combining characters by type value.

```javascript
getChrType() : EquationCombiningCharacterType;
```


**Returns**

[EquationCombiningCharacterType](../equationcombiningcharactertype/)

### setChrType(EquationCombiningCharacterType) {#setChrType-equationcombiningcharactertype-}

<b>@deprecated.</b> Please use the 'chrType' property instead. Specify combining characters by type value.

```javascript
setChrType(value: EquationCombiningCharacterType) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EquationCombiningCharacterType](../equationcombiningcharactertype/) | The value to set. |

### getPosition() {#getPosition--}

<b>@deprecated.</b> Please use the 'position' property instead. This attribute specifies the position of the character in the object

```javascript
getPosition() : EquationCharacterPositionType;
```


**Returns**

[EquationCharacterPositionType](../equationcharacterpositiontype/)

### setPosition(EquationCharacterPositionType) {#setPosition-equationcharacterpositiontype-}

<b>@deprecated.</b> Please use the 'position' property instead. This attribute specifies the position of the character in the object

```javascript
setPosition(value: EquationCharacterPositionType) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EquationCharacterPositionType](../equationcharacterpositiontype/) | The value to set. |

### getVertJc() {#getVertJc--}

<b>@deprecated.</b> Please use the 'vertJc' property instead. This attribute, combined with pos of groupChrPr, specifies the vertical layout of the groupChr object. Where pos specifies the position of the grouping character, vertJc specifies the alignment of the object with respect to the baseline.

```javascript
getVertJc() : EquationCharacterPositionType;
```


**Returns**

[EquationCharacterPositionType](../equationcharacterpositiontype/)

### setVertJc(EquationCharacterPositionType) {#setVertJc-equationcharacterpositiontype-}

<b>@deprecated.</b> Please use the 'vertJc' property instead. This attribute, combined with pos of groupChrPr, specifies the vertical layout of the groupChr object. Where pos specifies the position of the grouping character, vertJc specifies the alignment of the object with respect to the baseline.

```javascript
setVertJc(value: EquationCharacterPositionType) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EquationCharacterPositionType](../equationcharacterpositiontype/) | The value to set. |

### isNull() {#isNull--}

Checks whether the implementation object is null.

```javascript
isNull() : boolean;
```


### getStartIndex() {#getStartIndex--}

<b>@deprecated.</b> Please use the 'startIndex' property instead. Gets the start index of the characters.

```javascript
getStartIndex() : number;
```


### getLength() {#getLength--}

<b>@deprecated.</b> Please use the 'length' property instead. Gets the length of the characters.

```javascript
getLength() : number;
```


### getFont() {#getFont--}

<b>@deprecated.</b> Please use the 'font' property instead. Returns the font of this object.

```javascript
getFont() : Font;
```


**Returns**

[Font](../font/)

### getTextOptions() {#getTextOptions--}

<b>@deprecated.</b> Please use the 'textOptions' property instead. Returns the text options.

```javascript
getTextOptions() : TextOptions;
```


**Returns**

[TextOptions](../textoptions/)

### setWordArtStyle(PresetWordArtStyle) {#setWordArtStyle-presetwordartstyle-}

Sets the preset WordArt style.

```javascript
setWordArtStyle(style: PresetWordArtStyle) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | [PresetWordArtStyle](../presetwordartstyle/) | The preset WordArt style. |

**Remarks**

Only for the text of shape/chart.

### getParentNode() {#getParentNode--}

<b>@deprecated.</b> Please use the 'parentNode' property instead. Specifies the parent node of the current node

```javascript
getParentNode() : EquationNode;
```


**Returns**

[EquationNode](../equationnode/)

### setParentNode(EquationNode) {#setParentNode-equationnode-}

<b>@deprecated.</b> Please use the 'parentNode' property instead. Specifies the parent node of the current node

```javascript
setParentNode(value: EquationNode) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [EquationNode](../equationnode/) | The value to set. |

### getEquationType() {#getEquationType--}

<b>@deprecated.</b> Please use the 'equationType' property instead. Get the equation type of the current node

```javascript
getEquationType() : EquationNodeType;
```


**Returns**

[EquationNodeType](../equationnodetype/)

### toLaTeX() {#toLaTeX--}

Convert this equtation to LaTeX expression.

```javascript
toLaTeX() : string;
```


### toMathML() {#toMathML--}

Convert this equtation to MathML expression.

```javascript
toMathML() : string;
```


### addChild(EquationNodeType) {#addChild-equationnodetype-}

Insert a node of the specified type at the end of the child node list of the current node.

```javascript
addChild(equationType: EquationNodeType) : EquationNode;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| equationType | [EquationNodeType](../equationnodetype/) | Types of Equation Nodes |

**Returns**

If the specified type exists, the corresponding node is returned, and if the type does not exist, a node of unknown type is returned.

### addChild(EquationNode) {#addChild-equationnode-}

Inserts the specified node at the end of the current node's list of child nodes.

```javascript
addChild(node: EquationNode) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [EquationNode](../equationnode/) | The specified node |

### insertChild(number, EquationNodeType) {#insertChild-number-equationnodetype-}

Inserts a node of the specified type at the specified index position in the current node's child node list.

```javascript
insertChild(index: number, equationType: EquationNodeType) : EquationNode;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | number | index value |
| equationType | [EquationNodeType](../equationnodetype/) | Types of Equation Nodes |

**Returns**

If the specified type exists, the corresponding node is returned, and if the type does not exist, a node of unknown type is returned.

### insertAfter(EquationNodeType) {#insertAfter-equationnodetype-}

Inserts the specified node after the current node.

```javascript
insertAfter(equationType: EquationNodeType) : EquationNode;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| equationType | [EquationNodeType](../equationnodetype/) | Types of Equation Nodes |

**Returns**

If the specified type exists, the corresponding node is returned, and if the type does not exist, a node of unknown type is returned.

### insertBefore(EquationNodeType) {#insertBefore-equationnodetype-}

Inserts the specified node before the current node.

```javascript
insertBefore(equationType: EquationNodeType) : EquationNode;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| equationType | [EquationNodeType](../equationnodetype/) | Types of Equation Nodes |

**Returns**

If the specified type exists, the corresponding node is returned, and if the type does not exist, a node of unknown type is returned.

### getChild(number) {#getChild-number-}

Returns the node at the specified index among the children of the current node.

```javascript
getChild(index: number) : EquationNode;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | number | Index of the node |

**Returns**

Returns the corresponding node if the specified node exists, otherwise returns null.

### remove() {#remove--}

Removes itself from the parent.

```javascript
remove() : void;
```


### removeChild(EquationNode) {#removeChild-equationnode-}

Removes the specified node from the current node's children.

```javascript
removeChild(node: EquationNode) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [EquationNode](../equationnode/) | Node to be deleted. |

### removeChild(number) {#removeChild-number-}

Removes the node at the specified index from the current node's children.

```javascript
removeChild(index: number) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | number | Index of the node |

### removeAllChildren() {#removeAllChildren--}

Removes all the child nodes of the current node.

```javascript
removeAllChildren() : void;
```


### createNode(EquationNodeType, Workbook, EquationNode) {#createNode-equationnodetype-workbook-equationnode-}

Create a node of the specified type.

```javascript
static createNode(equationType: EquationNodeType, workbook: Workbook, parent: EquationNode) : EquationNode;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| equationType | [EquationNodeType](../equationnodetype/) | Types of Equation Nodes |
| workbook | [Workbook](../workbook/) | The workbook object associated with the equation |
| parent | [EquationNode](../equationnode/) | The parent node where this node is located |

**Returns**

If the specified type exists, the corresponding node is returned, and if the type does not exist, a node of unknown type is returned.

### equals(Object) {#equals-object-}

Determine whether the current equation node is equal to the specified node

```javascript
equals(obj: Object) : boolean;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | Object | The specified node |

### getType() {#getType--}

Represents the type of the node.

```javascript
getType() : TextNodeType;
```


**Returns**

[TextNodeType](../textnodetype/)


