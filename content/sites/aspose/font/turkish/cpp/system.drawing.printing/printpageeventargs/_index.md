---
title: "System::Drawing::Printing::PrintPageEventArgs sınıfı"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Printing::PrintPageEventArgs sınıfı. PrintPage olayı için veri sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


PrintPage olayı için veri sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Graphics](./get_graphics/)() | UYGULANMADI. |
| [get_HasMorePages](./get_hasmorepages/)() | UYGULANMADI. |
| [get_PageSettings](./get_pagesettings/)() | UYGULANMADI. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | [PrintPageEventArgs](./) sınıfının yeni bir örneğini oluşturur. |
| [set_HasMorePages](./set_hasmorepages/)(bool) | UYGULANMADI. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ptr](./ptr/) | Bu sınıfın bir örneğine ortak işaretçi için bir takma addır. |
## Ayrıca Bakınız

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
