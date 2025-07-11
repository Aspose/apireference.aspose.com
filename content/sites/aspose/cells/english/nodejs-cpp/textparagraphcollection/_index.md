﻿---
title: TextParagraphCollection
second_title: Aspose.Cells for Node.js via C++ API Reference
description: Represents all text paragraph.
type: docs
url: /nodejs-cpp/textparagraphcollection/
---

## TextParagraphCollection class

Represents all text paragraph.

```javascript
class TextParagraphCollection;
```


## Properties

| Property | Type | Description |
| --- | --- | --- |
| [count](#count--)| number | Readonly. Gets the count of text paragraphs. |

## Methods

| Method | Description |
| --- | --- |
| [get(number)](#get-number-)| Gets the [TextParagraph](../textparagraph/) object at specific index. |
| [getCount()](#getCount--)| <b>@deprecated.</b> Please use the 'count' property instead. Gets the count of text paragraphs. |
| [getEnumerator()](#getEnumerator--)| Gets the enumerator of the paragraphs. |
| [isNull()](#isNull--)| Checks whether the implementation object is null. |


### count {#count--}

Readonly. Gets the count of text paragraphs.

```javascript
count : number;
```


### get(number) {#get-number-}

Gets the [TextParagraph](../textparagraph/) object at specific index.

```javascript
get(index: number) : TextParagraph;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | number | The index. |

**Returns**

[TextParagraph](../textparagraph/)

### getCount() {#getCount--}

<b>@deprecated.</b> Please use the 'count' property instead. Gets the count of text paragraphs.

```javascript
getCount() : number;
```


### getEnumerator() {#getEnumerator--}

Gets the enumerator of the paragraphs.

```javascript
getEnumerator() : TextParagraphEnumerator;
```


**Returns**

[TextParagraphEnumerator](../textparagraphenumerator/)

### isNull() {#isNull--}

Checks whether the implementation object is null.

```javascript
isNull() : boolean;
```



