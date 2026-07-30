---
title: "System::Text::EncodingInfo sınıfı"
linktitle: "EncodingInfo"
second_title: "Aspose.Font için C++"
description: "System::Text::EncodingInfo sınıfı. Kodlamaya ilişkin kısa bilgi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmaktan kaçının, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1900
url: /tr/cpp/system.text/encodinginfo/
---
## EncodingInfo class


Kodlamaya ilişkin kısa bilgi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmaktan kaçının, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class EncodingInfo : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [EncodingInfo](./encodinginfo/)(int, const String\&, const String\&) | Yapıcı. |
| [get_CodePage](./get_codepage/)() const | Kod sayfası kimliğini alır. |
| [get_DisplayName](./get_displayname/)() const | Tam yerelleştirilmiş kodlama adını alır. |
| [get_Name](./get_name/)() const | Kodlamanın kısa adını alır. |
| [GetEncoding](./getencoding/)() | Bilgiyle tanımlanan kodlamayı alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
