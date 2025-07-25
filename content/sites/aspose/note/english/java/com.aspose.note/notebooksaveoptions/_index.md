---
title: NotebookSaveOptions
second_title: Aspose.Note for Java API Reference
description: An abstract base class which represents notebook saving options for a particular format.
type: docs
weight: 61
url: /java/com.aspose.note/notebooksaveoptions/
---

**Inheritance:**
java.lang.Object
```
public abstract class NotebookSaveOptions
```

An abstract base class which represents notebook saving options for a particular format.
## Methods

| Method | Description |
| --- | --- |
| [getDeferredSaving()](#getDeferredSaving--) | Gets or sets a value indicating whether children documents should be saved explicitly. |
| [getDocumentSaveOptionsInternal()](#getDocumentSaveOptionsInternal--) | Gets the save options for all notebook's child documents. |
| [getFlatten()](#getFlatten--) | Gets or sets a value indicating whether the notebook children hierarchy is saved flattened. |
| [getSaveFormat()](#getSaveFormat--) | Gets the format in which the notebook is saved. |
| [setDeferredSaving(boolean value)](#setDeferredSaving-boolean-) | Gets or sets a value indicating whether children documents should be saved explicitly. |
| [setFlatten(boolean value)](#setFlatten-boolean-) | Gets or sets a value indicating whether the notebook children hierarchy is saved flattened. |
### getDeferredSaving() {#getDeferredSaving--}
```
public boolean getDeferredSaving()
```


Gets or sets a value indicating whether children documents should be saved explicitly.

--------------------

Default value is `false`, so child documents will be saved implicitly. Value `true` is indicating that user should save each notebook's child node explicitly. If notebook is saving to stream, the value is always `true` despite was explicitly set by user to `false`.

**Returns:**
boolean
### getDocumentSaveOptionsInternal() {#getDocumentSaveOptionsInternal--}
```
public abstract SaveOptions getDocumentSaveOptionsInternal()
```


Gets the save options for all notebook's child documents.

**Returns:**
[SaveOptions](../../com.aspose.note/saveoptions) - The `SaveOptions`.
### getFlatten() {#getFlatten--}
```
public boolean getFlatten()
```


Gets or sets a value indicating whether the notebook children hierarchy is saved flattened.

**Returns:**
boolean
### getSaveFormat() {#getSaveFormat--}
```
public abstract int getSaveFormat()
```


Gets the format in which the notebook is saved.

**Returns:**
int
### setDeferredSaving(boolean value) {#setDeferredSaving-boolean-}
```
public void setDeferredSaving(boolean value)
```


Gets or sets a value indicating whether children documents should be saved explicitly.

--------------------

Default value is `false`, so child documents will be saved implicitly. Value `true` is indicating that user should save each notebook's child node explicitly. If notebook is saving to stream, the value is always `true` despite was explicitly set by user to `false`.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

### setFlatten(boolean value) {#setFlatten-boolean-}
```
public void setFlatten(boolean value)
```


Gets or sets a value indicating whether the notebook children hierarchy is saved flattened.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

