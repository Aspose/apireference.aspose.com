---
title: "Aspose::Font::Sources::StreamSource класс"
linktitle: "StreamSource"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Sources::StreamSource класс. Определяет способ получения файлового потока, когда он нужен в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.font.sources/streamsource/
---
## StreamSource class


Определяет способ получения файлового потока, когда он нужен.

```cpp
class StreamSource : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Clone](./clone/)() | Клонирует объект источника потока. |
| [get_Offset](./get_offset/)() const | Получает смещение внутри источника. |
| virtual [GetFontStream](./getfontstream/)() | Возвращает поток [Font](../../aspose.font/font/). |
| virtual [MustCloseAfterUse](./mustcloseafteruse/)() | Наследники могут препятствовать закрытию потока. Возвращает true, если источник потока хочет, чтобы поток закрывался после использования. В противном случае возвращает false. |
| [set_Offset](./set_offset/)(int64_t) | Устанавливает смещение внутри источника. |
| [StreamSource](./streamsource/)() | Инициализирует экземпляр источника потока. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
