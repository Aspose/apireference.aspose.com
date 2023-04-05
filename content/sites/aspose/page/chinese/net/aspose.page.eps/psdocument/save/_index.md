---
title: PsDocument.Save
second_title: Aspose.Page for .NET API 参考
description: PsDocument 方法. 将 PS/EPS 文件保存到设备
type: docs
weight: 200
url: /zh/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

将 PS/EPS 文件保存到设备。

```csharp
public override void Save(Device device, SaveOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| device | Device | 一个输出设备。 |
| options | SaveOptions | 包含指定转换期间抛出的错误输出的标志。 |

### 也可以看看

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* 命名空间 [Aspose.Page.EPS](../../psdocument/)
* 部件 [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

保存给定[`PsDocument`](../)作为 EPS 文件。此方法仅在更新 XMP 元数据后使用。 它使用更新的现有元数据或调用 GetMetadata 方法时创建的新元数据保存初始 EPS 文件。 在最后一种情况下，添加了所有必要的 PostScript 代码和 EPS 注释。

```csharp
public void Save(Stream epsStream)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| epsStream | Stream | 输出 EPS 文件流。 |

### 也可以看看

* class [PsDocument](../)
* 命名空间 [Aspose.Page.EPS](../../psdocument/)
* 部件 [Aspose.Page](../../../)

---

## Save() {#save}

保存给定[`PsDocument`](../)作为 EPS 文件。只有从头开始创建 PsDocument 时才使用此方法。

```csharp
public void Save()
```

### 也可以看看

* class [PsDocument](../)
* 命名空间 [Aspose.Page.EPS](../../psdocument/)
* 部件 [Aspose.Page](../../../)


