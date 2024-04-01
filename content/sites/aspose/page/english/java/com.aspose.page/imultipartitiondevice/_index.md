---
title: IMultiPartitionDevice
second_title: Aspose.Page for Java API Reference
description: Basic interface for multi-partition device.
type: docs
weight: 24
url: /java/com.aspose.page/imultipartitiondevice/
---
**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public interface IMultiPartitionDevice extends IMultiPageDevice
```

Basic interface for multi-partition device.
## Methods

| Method | Description |
| --- | --- |
| [closePartition()](#closePartition--) | Accomplishes the current document partition. |
| [getCurrentRelativePageNumber()](#getCurrentRelativePageNumber--) | Returns the relative number of the current page within the current document partition. |
| [openPartition()](#openPartition--) | Starts the new document partition. |
### closePartition() {#closePartition--}
```
public abstract void closePartition()
```


Accomplishes the current document partition.

### getCurrentRelativePageNumber() {#getCurrentRelativePageNumber--}
```
public abstract int getCurrentRelativePageNumber()
```


Returns the relative number of the current page within the current document partition.

**Returns:**
int - The relative number of the current page within the current document partition.
### openPartition() {#openPartition--}
```
public abstract void openPartition()
```


Starts the new document partition.

