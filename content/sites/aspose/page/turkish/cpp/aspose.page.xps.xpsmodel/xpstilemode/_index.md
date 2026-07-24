---
title: "Aspose::Page::XPS::XpsModel::XpsTileMode enum'ı"
linktitle: "XpsTileMode"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsTileMode enum. C++'da döşeme fırçalarının TileMode özelliğinin geçerli değerleri."
type: docs
weight: 5500
url: /tr/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


Döşeme fırçalarının TileMode özelliğinin geçerli değerleri.

```cpp
enum class XpsTileMode
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| None | 0 | Bu modda, yalnızca tek temel döşeme çizilir. Kalan alan şeffaf bırakılır. |
| Tile | 1 | Bu modda, temel döşeme çizilir ve kalan alan, temel döşemenin tekrarlanmasıyla doldurulur; böylece her döşemenin sağ kenarı bir sonraki döşemenin sol kenarıyla, alt kenarı ise bir sonraki döşemenin üst kenarıyla birleşir. |
| FlipX | 2 | Döşeme düzeni Tile döşeme moduna benzer, ancak döşemelerin alternatif sütunları yatay olarak çevrilir. Temel döşeme, görünüm penceresi tarafından belirtilen şekilde konumlandırılır. Bu döşemenin sol ve sağ sütunlarındaki döşemeler yatay olarak çevrilir. |
| FlipY | 3 | Döşeme düzeni Tile döşeme moduna benzer, ancak döşemelerin alternatif satırları dikey olarak çevrilir. Temel döşeme, görünüm penceresi tarafından belirtilen şekilde konumlandırılır. Üstte ve alttaki satırlar dikey olarak çevrilir. |
| FlipXY | 4 | Karo düzeni Tile tile mode ile benzer, ancak alternatif sütunlardaki karolar yatay olarak çevrilir ve alternatif satırlardaki karolar dikey olarak çevrilir. Temel karo, görünüm penceresi tarafından belirtilen şekilde konumlandırılır. |

## Ayrıca Bakınız

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
