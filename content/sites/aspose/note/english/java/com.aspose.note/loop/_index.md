---
title: Loop
second_title: Aspose.Note for Java API Reference
description: Represents a loop.
type: docs
weight: 48
url: /java/com.aspose.note/loop/
---

**Inheritance:**
java.lang.Object, [com.aspose.note.Node](../../com.aspose.note/node)

**All Implemented Interfaces:**
[com.aspose.note.IOutlineElementChildNode](../../com.aspose.note/ioutlineelementchildnode)
```
public class Loop extends Node implements IOutlineElementChildNode
```

Represents a loop.
## Constructors

| Constructor | Description |
| --- | --- |
| [Loop()](#Loop--) | Initializes a new instance of the  Loop  class. |
## Methods

| Method | Description |
| --- | --- |
| [accept(DocumentVisitor visitor)](#accept-com.aspose.note.DocumentVisitor-) | Accepts the visitor of the node. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDocument()](#getDocument--) | Gets the document of the node. |
| [getHyperlinkUrl()](#getHyperlinkUrl--) | Gets the hyperlink. |
| [getLastModifiedTime()](#getLastModifiedTime--) | Gets last modified time. |
| [getNextSibling()](#getNextSibling--) | Gets the next node at the same node tree level. |
| [getNodeId()](#getNodeId--) | Gets the node's ID. |
| [getNodeType()](#getNodeType--) | Gets the node type. |
| [getParentNode()](#getParentNode--) | Gets the parent node. |
| [getPreviousSibling()](#getPreviousSibling--) | Gets the previous node at the same node tree level. |
| [hashCode()](#hashCode--) |  |
| [isComposite()](#isComposite--) | Gets a value indicating whether this node is composite. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHyperlinkUrl(String value)](#setHyperlinkUrl-java.lang.String-) | Sets the hyperlink. |
| [setLastModifiedTime(Date value)](#setLastModifiedTime-java.util.Date-) | Sets last modified time. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Loop() {#Loop--}
```
public Loop()
```


Initializes a new instance of the  Loop  class.

### accept(DocumentVisitor visitor) {#accept-com.aspose.note.DocumentVisitor-}
```
public void accept(DocumentVisitor visitor)
```


Accepts the visitor of the node.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| visitor | [DocumentVisitor](../../com.aspose.note/documentvisitor) | The object of a class derived from the  DocumentVisitor . |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocument() {#getDocument--}
```
public Document getDocument()
```


Gets the document of the node.

Value: The document.

**Returns:**
[Document](../../com.aspose.note/document)
### getHyperlinkUrl() {#getHyperlinkUrl--}
```
public String getHyperlinkUrl()
```


Gets the hyperlink.

**Returns:**
java.lang.String
### getLastModifiedTime() {#getLastModifiedTime--}
```
public Date getLastModifiedTime()
```


Gets last modified time.

**Returns:**
java.util.Date
### getNextSibling() {#getNextSibling--}
```
public INode getNextSibling()
```


Gets the next node at the same node tree level.

Value: The next sibling.

**Returns:**
[INode](../../com.aspose.note/inode)
### getNodeId() {#getNodeId--}
```
public ExtendedGuid getNodeId()
```


Gets the node's ID.

**Returns:**
[ExtendedGuid](../../com.aspose.note.revision.types/extendedguid)
### getNodeType() {#getNodeType--}
```
public int getNodeType()
```


Gets the node type.

**Returns:**
int
### getParentNode() {#getParentNode--}
```
public ICompositeNode getParentNode()
```


Gets the parent node.

**Returns:**
[ICompositeNode](../../com.aspose.note/icompositenode)
### getPreviousSibling() {#getPreviousSibling--}
```
public INode getPreviousSibling()
```


Gets the previous node at the same node tree level.

Value: The previous sibling.

**Returns:**
[INode](../../com.aspose.note/inode)
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isComposite() {#isComposite--}
```
public boolean isComposite()
```


Gets a value indicating whether this node is composite. If true the node can have child nodes.

**Returns:**
boolean
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setHyperlinkUrl(String value) {#setHyperlinkUrl-java.lang.String-}
```
public void setHyperlinkUrl(String value)
```


Sets the hyperlink.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String |  |

### setLastModifiedTime(Date value) {#setLastModifiedTime-java.util.Date-}
```
public void setLastModifiedTime(Date value)
```


Sets last modified time.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.Date |  |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

