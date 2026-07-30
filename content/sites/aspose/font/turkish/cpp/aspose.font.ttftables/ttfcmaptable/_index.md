---
title: "Aspose::Font::TtfTables::TtfCMapTable sınıfı"
linktitle: "TtfCMapTable"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfCMapTable sınıfı. C++'ta TTF Font dosyasının \"cmap\" tablosunu temsil eder."
type: docs
weight: 200
url: /tr/cpp/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class


TTF [Font](../../aspose.font/font/) dosyasının "cmap" tablosunu temsil eder.

```cpp
class TtfCMapTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [TtfCMapSubtableDescription](./ttfcmapsubtabledescription/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [FindUnicodeTable](./findunicodetable/)() | Unicode CMap'i arar ve döndürür. Eğer ucs-4 CMap varsa - önce onu döndürür; aksi takdirde - bulabildiği herhangi bir unicode cmap'i döndürür. |
| static [get_Tag](./get_tag/)() | Tablo etiketini alır. |
| [GetAllSubtables](./getallsubtables/)() | CMap tablosundaki tüm alt tabloları döndürür. |
| [GetPlatformTables](./getplatformtables/)(uint16_t, uint16_t) | planformId ve platformSpecificId için CMap alt tablolarını döndürür. |
## Ayrıca Bakınız

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
