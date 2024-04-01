---
title: IMultiPageDevice
second_title: Aspose.Page for Java API Reference
description: This interface contains methods for manipulating multi-paged device.
type: docs
weight: 22
url: /java/com.aspose.page/imultipagedevice/
---
```
public interface IMultiPageDevice
```

This interface contains methods for manipulating multi-paged device.
## Methods

| Method | Description |
| --- | --- |
| [closePage()](#closePage--) | Makes necessary preparation of the device after page has been rendered. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) | Gets current page number. |
| [initPageNumbers()](#initPageNumbers--) | Initializes numbers of pages to render. |
| [openPage(float width, float height)](#openPage-float-float-) | Makes necessary preparation of the device before page rendering. |
| [openPage(String title)](#openPage-java.lang.String-) | Makes necessary preparation of the device before page rendering. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) | Updates page parameters from other multi-paged device. |
### closePage() {#closePage--}
```
public abstract void closePage()
```


Makes necessary preparation of the device after page has been rendered.

### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public abstract int getCurrentPageNumber()
```


Gets current page number.

**Returns:**
int - Current page number.
### initPageNumbers() {#initPageNumbers--}
```
public abstract void initPageNumbers()
```


Initializes numbers of pages to render.

### openPage(float width, float height) {#openPage-float-float-}
```
public abstract boolean openPage(float width, float height)
```


Makes necessary preparation of the device before page rendering.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | float | A width of the page. |
| height | float | A height of the page. |

**Returns:**
boolean - Returns true if opened page has a number that falls in a range of selected page numbers and false otherwise.
### openPage(String title) {#openPage-java.lang.String-}
```
public abstract boolean openPage(String title)
```


Makes necessary preparation of the device before page rendering.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| title | java.lang.String | The page title. |

**Returns:**
boolean - True if page is from requested range, otherwise false. Used in devices that can render specified array of page numbers.
### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public abstract void updatePageParameters(IMultiPageDevice device)
```


Updates page parameters from other multi-paged device.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) | Another instance of the same device. |

