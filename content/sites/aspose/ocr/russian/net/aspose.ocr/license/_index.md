---
title: Class License
second_title: Справочник по Aspose.OCR для .NET API
description: Aspose.OCR.License сорт. Предоставляет методы лицензирования компонента.
type: docs
weight: 120
url: /ru/net/aspose.ocr/license/
---
## License class

Предоставляет методы лицензирования компонента.

```csharp
public class License
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [License](license/)() | Конструктор по умолчанию. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | Получает значение, указывающее, является ли продукт лицензированным. |

## Методы

| Имя | Описание |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | Лицензирует компонент. |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | Лицензирует компонент. |

### Примеры

В этом примере будет предпринята попытка найти файл лицензии с именем MyLicense.lic в папке, содержащей компонент, в папке, содержащей вызывающую сборку, в папке входной сборки, а затем в встроенные ресурсы вызывающей сборки.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Смотрите также

* пространство имен [Aspose.OCR](../../aspose.ocr/)
* сборка [Aspose.OCR](../../)


