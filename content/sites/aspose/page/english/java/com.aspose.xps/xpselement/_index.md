---
title: XpsElement
second_title: Aspose.Page for Java API Reference
description: Class incapsulating common XPS element features.
type: docs
weight: 19
url: /java/com.aspose.xps/xpselement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class XpsElement extends XpsObject implements Iterable<XpsContentElement>
```

Class incapsulating common XPS element features.
## Methods

| Method | Description |
| --- | --- |
| [get(int i)](#get-int-) | Provides access to element's children by index \`\`\` i \`\`\`. |
| [size()](#size--) | Returns the number of child elements. |
| [iterator()](#iterator--) | Implementation of \`\`\` Iterable \`\`\` interface. |
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Provides access to element's children by index \`\`\` i \`\`\`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| i | int | Index of child element. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at \`\`\` i \`\`\` position.
### size() {#size--}
```
public int size()
```


Returns the number of child elements.

**Returns:**
int - The number of child elements.
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Implementation of \`\`\` Iterable \`\`\` interface.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Returns enumerator for the list.
