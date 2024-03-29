---
title: Metered
second_title: Справочник по Aspose.Diagram для .NET API
description: Предоставляет методы для установки измеренного ключа.
type: docs
weight: 2340
url: /ru/net/aspose.diagram/metered/
---
## Metered class

Предоставляет методы для установки измеренного ключа.

```csharp
public class Metered
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Metered](metered/)() | Инициализирует новый экземпляр этого класса. |

## Методы

| Имя | Описание |
| --- | --- |
| [SetMeteredKey](../../aspose.diagram/metered/setmeteredkey/)(string, string) | Устанавливает лимитный открытый и закрытый ключ. Если вы покупаете лимитную лицензию, при запуске приложения должен вызываться этот API, обычно этого достаточно. Однако, если всегда не удается загрузить данные о потреблении и превышает 24 часа, лицензия будет установлена в статусе ознакомительной версии, чтобы избежать этого, вы должны регулярно проверять статус лицензии, если это статус пробной версии, снова вызывать этот API. |
| static [GetConsumptionCredit](../../aspose.diagram/metered/getconsumptioncredit/)() | Получает потребительский кредит |
| static [GetConsumptionQuantity](../../aspose.diagram/metered/getconsumptionquantity/)() | Получает размер файла потребления |

### Примеры

В этом примере будет предпринята попытка установить лимитированный открытый и закрытый ключ

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

файл jar компонента:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### Смотрите также

* пространство имен [Aspose.Diagram](../../aspose.diagram/)
* сборка [Aspose.Diagram](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Diagram.dll -->
