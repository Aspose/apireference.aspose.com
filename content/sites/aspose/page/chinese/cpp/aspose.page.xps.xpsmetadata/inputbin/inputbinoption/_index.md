---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption 类"
linktitle: "InputBinOption"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption 类。描述 C++ 中的 JobInputBin、DocumentInputBin 和 PageInputBin 功能选项。"
type: docs
weight: 700
url: /zh/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


描述 [JobInputBin](../../jobinputbin/)、[DocumentInputBin](../../documentinputbin/) 和 [PageInputBin](../../pageinputbin/) 功能选项。

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | 向该选项添加一个 [IInputBinOptionItem](../iinputbinoptionitem/) 实例数组。 |
| [Clone](./clone/)() | 克隆此选项实例。 |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | 创建一个新实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [AutoSelect](./autoselect/) | 设备将根据配置自动选择最佳选项。 |
| static [AutoSheetFeeder](./autosheetfeeder/) | 设备输入托盘用于喷墨打印机。 |
| static [Cassette](./cassette/) | 指定送纸盒为盒式。 |
| static [Manual](./manual/) | 指定默认手动送纸盒。 |
| static [Tractor](./tractor/) | 指定送纸盒为牵引式。 |
## 另见

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
