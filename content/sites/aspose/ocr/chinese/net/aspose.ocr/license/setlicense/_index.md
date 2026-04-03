---
title: SetLicense
second_title: Aspose.OCR 适用于 .NET API 参考
description: 为组件授权。
type: docs
weight: 30
url: /zh/net/aspose.ocr/license/setlicense/
---
## SetLicense(string) {#setlicense_1}

为组件授权。

```csharp
public void SetLicense(string licenseName)
```

### 备注

尝试在以下位置查找许可证：

1. 明确路径。

2. 包含 Aspose 组件程序集的文件夹。

3. 包含客户端调用程序集的文件夹。

4. 包含入口（启动）程序集的文件夹。

5. 客户端调用程序集中的嵌入资源。

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. 明确路径。

2. 客户端调用程序集中的嵌入资源。

2. 包含 Aspose 组件 JAR 文件的文件夹。

3. 包含客户端调用 JAR 文件的文件夹。

### 示例

在此示例中，将尝试在包含组件的文件夹、包含调用程序集的文件夹、入口程序集的文件夹以及调用程序集的嵌入资源中查找名为 MyLicense.lic 的许可证文件。

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

组件的 jar 文件：

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

可以是完整或简短的文件名，或嵌入资源的名称。使用空字符串切换到评估模式。

### 另请参见

* class [License](../../license)
* namespace [Aspose.OCR](../../license)
* assembly [Aspose.OCR](../../../)

---

## SetLicense(Stream) {#setlicense}

为组件授权。

```csharp
public void SetLicense(Stream stream)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | 流 | 包含许可证的流。 |

### 备注

使用此方法从流中加载许可证。

### 示例

```csharp
[C#]

License license = new License();
license.SetLicense(myStream);

License license = new License();
license.setLicense(myStream);
```

### 另请参见

* class [License](../../license)
* namespace [Aspose.OCR](../../license)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
