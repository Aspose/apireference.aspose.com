---
title: "Aspose::Font::Ttf::LicenseFlags 类"
linktitle: "LicenseFlags"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::LicenseFlags 类。表示 C++ 中用于 ''OS/2'' 表（字段 fsType）的嵌入标志的辅助包装器。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.ttf/licenseflags/
---
## LicenseFlags class


表示来自 'OS/2' 表（字段 fsType）的嵌入标志的辅助包装器。

```cpp
class LicenseFlags : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_FSType](./get_fstype/)() const | 从 OS/2 表获取原始 fsType 值，如果表中不存在此字段则返回 0。 |
| [get_FSTypeAbsent](./get_fstypeabsent/)() const | 如果 'OS/2' 表中缺少 fsType 标志，则返回 true。 |
| [get_IsBitmapOnlyEmbedding](./get_isbitmaponlyembedding/)() | 检测 fsType 是否允许 BitmapOnly 嵌入。 |
| [get_IsEditableEmbedding](./get_iseditableembedding/)() | 检测 fsType 是否允许可编辑嵌入。 |
| [get_IsInstallableEmbedding](./get_isinstallableembedding/)() | 检测 fsType 是否为可安装嵌入。 |
| [get_IsNoSubsettingEmbedding](./get_isnosubsettingembedding/)() | 检测 fsType 是否允许无子集嵌入。 |
| [get_IsPreviewAndPrintEmbedding](./get_ispreviewandprintembedding/)() | 检测 fsType 是否允许预览和打印嵌入。 |
| [get_IsReservedType](./get_isreservedtype/)() | 检测 fsType 的保留位（位 0）是否被设置。 |
| [get_IsRestrictedLicenseEmbedding](./get_isrestrictedlicenseembedding/)() | 检测 fsType 是否为受限 [License](../../aspose.font/license/) 嵌入。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
