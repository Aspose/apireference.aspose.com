---
title: "Aspose::Font::FontEnvironment класс"
linktitle: "FontEnvironment"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::FontEnvironment класс. Предоставляет информацию о текущей среде и платформе в C++."
type: docs
weight: 600
url: /ru/cpp/aspose.font/fontenvironment/
---
## FontEnvironment class


Предоставляет информацию о текущей среде и платформе.

```cpp
class FontEnvironment : public System::Object
```

## Enums

| Перечисление | Описание |
| --- | --- |
| [ParsingStrictness](./parsingstrictness/) | Типы строгости разбора. |
## Методы

| Метод | Описание |
| --- | --- |
| static [get_CffCommonFontsSettings](./get_cffcommonfontssettings/)() | Настройки, общие для шрифтов CFF. |
| static [get_Current](./get_current/)() | Получает текущую среду. |
| [get_CurrentPlatformId](./get_currentplatformid/)() | Получает текущий идентификатор платформы. |
| [get_FontSpecificEncodings](./get_fontspecificencodings/)() const | Сохраняет специфические кодировки для шрифтов, учитывающих потребителя. Например, PDF‑документы используют специфические кодировки Adobe Symbol и ZapfDingbats. |
| [get_Strictness](./get_strictness/)() const | Некоторые шрифты могут содержать неожиданные данные, неуказанные функции или быть грубо обрезанными. |
| [set_Strictness](./set_strictness/)(FontEnvironment::ParsingStrictness) | Некоторые шрифты могут содержать неожиданные данные, неуказанные функции или быть грубо обрезанными. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
