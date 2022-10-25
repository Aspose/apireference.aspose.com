---
title: FileSystemFactory
second_title: Aspose.3D for Java API Reference
description: com.aspose.threed.SaveOptions and com.aspose.threed.LoadOptions will create a com.aspose.threed.LocalFileSystem for default.
type: docs
weight: 215
url: /java/com.aspose.threed/filesystemfactory/
---
```
public interface FileSystemFactory
```

com.aspose.threed.SaveOptions and com.aspose.threed.LoadOptions will create a com.aspose.threed.LocalFileSystem for default. This can be a security issue in server environment. Use your own com.aspose.threed.FileSystemFactory to com.aspose.threed.IOConfig\#getFileSystemFactory to improve server side security.
## Methods

| Method | Description |
| --- | --- |
| [call()](#call--) | com.aspose.threed.SaveOptions and com.aspose.threed.LoadOptions will create a com.aspose.threed.LocalFileSystem for default. |
### call() {#call--}
```
public abstract FileSystem call()
```


com.aspose.threed.SaveOptions and com.aspose.threed.LoadOptions will create a com.aspose.threed.LocalFileSystem for default. This can be a security issue in server environment. Use your own com.aspose.threed.FileSystemFactory to com.aspose.threed.IOConfig\#getFileSystemFactory to improve server side security.

**Returns:**
[FileSystem](../../com.aspose.threed/filesystem)
