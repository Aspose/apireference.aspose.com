---
title: Graphics.DrawImageAbort
second_title: Aspose.Drawing for Java API Reference
description: 
type: docs
weight: 10
url: /java/com.aspose.drawing/graphics.drawimageabort/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.Delegate, com.aspose.ms.System.MulticastDelegate
```
public abstract static class Graphics.DrawImageAbort extends System.MulticastDelegate
```
## Constructors

| Constructor | Description |
| --- | --- |
| [DrawImageAbort()](#DrawImageAbort--) |  |
## Methods

| Method | Description |
| --- | --- |
| [invoke(System.IntPtr callbackdata)](#invoke-com.aspose.ms.System.IntPtr-) | Provides a callback method for deciding when the `DrawImage` method should prematurely cancel execution and stop drawing an image. |
| [beginInvoke(System.IntPtr callbackdata, System.AsyncCallback callback, Object state)](#beginInvoke-com.aspose.ms.System.IntPtr-com.aspose.ms.System.AsyncCallback-java.lang.Object-) |  |
| [endInvoke(System.IAsyncResult result)](#endInvoke-com.aspose.ms.System.IAsyncResult-) |  |
### DrawImageAbort() {#DrawImageAbort--}
```
public DrawImageAbort()
```


### invoke(System.IntPtr callbackdata) {#invoke-com.aspose.ms.System.IntPtr-}
```
public abstract boolean invoke(System.IntPtr callbackdata)
```


Provides a callback method for deciding when the `DrawImage` method should prematurely cancel execution and stop drawing an image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| callbackdata | com.aspose.ms.System.IntPtr | Internal pointer that specifies data for the callback method. This parameter is not passed by all `DrawImage` overloads. You can test for its absence by checking for the value `System.IntPtr.Zero`. |

**Returns:**
boolean - This method returns true if it decides that the `DrawImage` method should prematurely stop execution. Otherwise it returns false to indicate that the `DrawImage` method should continue execution.
### beginInvoke(System.IntPtr callbackdata, System.AsyncCallback callback, Object state) {#beginInvoke-com.aspose.ms.System.IntPtr-com.aspose.ms.System.AsyncCallback-java.lang.Object-}
```
public final System.IAsyncResult beginInvoke(System.IntPtr callbackdata, System.AsyncCallback callback, Object state)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| callbackdata | com.aspose.ms.System.IntPtr |  |
| callback | com.aspose.ms.System.AsyncCallback |  |
| state | java.lang.Object |  |

**Returns:**
com.aspose.ms.System.IAsyncResult
### endInvoke(System.IAsyncResult result) {#endInvoke-com.aspose.ms.System.IAsyncResult-}
```
public final boolean endInvoke(System.IAsyncResult result)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| result | com.aspose.ms.System.IAsyncResult |  |

**Returns:**
boolean
