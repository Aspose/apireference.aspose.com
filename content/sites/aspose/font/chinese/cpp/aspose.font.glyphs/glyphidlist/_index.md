---
title: "Aspose::Font::Glyphs::GlyphIdList 类"
linktitle: "GlyphIdList"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Glyphs::GlyphIdList 类。表示 C++ 中的字形 ID 列表。"
type: docs
weight: 700
url: /zh/cpp/aspose.font.glyphs/glyphidlist/
---
## GlyphIdList class


表示字形 ID 列表。

```cpp
class GlyphIdList : public System::Collections::Generic::List<System::SharedPtr<GlyphId>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<GlyphId\>\&) override | 向列表添加字形 ID。 |
| [Clear](./clear/)() override | 清空列表。 |
| [Contains](./contains/)(const System::SharedPtr\<GlyphId\>\&) const override | 如果字形 ID 在列表中，则返回 true。 |
| [idx_get](./idx_get/)(int32_t) const override | 根据索引返回字形 ID。 |
| [Remove](./remove/)(const System::SharedPtr\<GlyphId\>\&) override | 从列表中移除字形 ID。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而不是共享指针）。允许在容器中将指针切换为弱模式。 |
## 另见

* Class [List](../../system.collections.generic/list/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
