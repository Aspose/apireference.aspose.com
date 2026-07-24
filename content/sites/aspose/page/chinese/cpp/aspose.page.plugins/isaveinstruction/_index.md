---
title: "Aspose::Page::Plugins::ISaveInstruction 类"
linktitle: "ISaveInstruction"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Plugins::ISaveInstruction 类。通用保存指令接口，定义具体插件选项在 C++ 中应实现的公共成员。"
type: docs
weight: 1000
url: /zh/cpp/aspose.page.plugins/isaveinstruction/
---
## ISaveInstruction class


通用保存指令接口，定义具体插件选项应实现的通用成员。

```cpp
class ISaveInstruction : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) | 添加新的结果保存目标。 |
| virtual [get_SaveTargetsCollection](./get_savetargetscollection/)() | 获取已添加目标（文件或流数据源）的集合，用于保存操作结果。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
