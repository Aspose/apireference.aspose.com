---
title: Защитить определенный столбец на листе Excel
linktitle: Защитить определенный столбец на листе Excel
second_title: Справочник по Aspose.Cells для .NET API
description: Узнайте, как защитить определенный столбец на листе Excel с помощью Aspose.Cells для .NET. Пошаговое руководство по C#.
type: docs
weight: 80
url: /ru/net/protect-excel-file/protect-specific-column-in-excel-worksheet/
---
При работе с листами Excel в C# часто необходимо защитить определенные столбцы, чтобы предотвратить случайное изменение. В этом руководстве мы проведем вас через процесс защиты определенного столбца на листе Excel с помощью библиотеки Aspose.Cells for .NET. Мы предоставим вам пошаговое объяснение исходного кода C#, необходимого для этой задачи. Итак, приступим!

## Обзор защиты определенных столбцов на листе Excel

Защита определенных столбцов на листе Excel гарантирует, что эти столбцы останутся заблокированными и не могут быть изменены без надлежащей авторизации. Это особенно полезно, когда вы хотите ограничить доступ к редактированию определенных данных или формул, позволяя пользователям взаимодействовать с остальной частью рабочего листа. Библиотека Aspose.Cells для .NET предоставляет полный набор функций для программного управления файлами Excel, включая защиту столбцов.

## Настройка среды

Прежде чем мы начнем, убедитесь, что в вашей среде разработки установлена библиотека Aspose.Cells for .NET. Вы можете загрузить библиотеку с официального сайта Aspose и установить ее с помощью предоставленного установщика.

## Создание новой рабочей книги и рабочего листа

Чтобы начать защищать определенные столбцы, нам нужно создать новую книгу и лист, используя Aspose.Cells для .NET. Вот фрагмент кода:

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Создайте каталог, если он еще не существует.
bool IsExists = System.IO.Directory.Exists(dataDir);
if (!IsExists)
    System.IO.Directory.CreateDirectory(dataDir);

// Создайте новую рабочую книгу.
Workbook wb = new Workbook();

// Создайте объект рабочего листа и получите первый лист.
Worksheet sheet = wb.Worksheets[0];
```

Обязательно замените «КАТАЛОГ ВАШИХ ДОКУМЕНТОВ» фактическим путем к каталогу, в котором вы хотите сохранить файл Excel.

## Определение объектов Style и Style Flag

Чтобы установить определенные стили и флаги защиты для столбцов, нам нужно определить объекты стиля и флага стиля. Вот фрагмент кода:

```csharp
// Определите объект стиля.
Style style;

// Определите объект флага стиля.
StyleFlag flag;
```

## Перебор столбцов и их разблокировка

Далее нам нужно перебрать все столбцы на листе и разблокировать их. Это обеспечит возможность редактирования всех столбцов, кроме того, который мы хотим защитить. Вот фрагмент кода:

```csharp
// Прокрутите все столбцы на листе и разблокируйте их.
for (int i = 0; i <= 255; i++)
{
    style = sheet.Cells.Columns[(byte)i].Style;
    style.IsLocked = false;
    flag = new StyleFlag();
    flag.Locked = true;
    sheet.Cells.Columns[(byte)i].ApplyStyle(style, flag);
}
```

## Блокировка определенного столбца

Теперь давайте заблокируем определенный столбец. В этом примере мы заблокируем первый столбец (индекс столбца 0). Вот фрагмент кода:

```csharp
// Получите первый стиль столбца.
style = sheet.Cells.Columns[0].Style;

// Закрой.
style.IsLocked = true;
```

## Применение стилей к столбцам

После блокировки определенного столбца нам нужно применить стиль и флаг к этому столбцу. Вот фрагмент кода:

```csharp
//Создайте экземпляр флага.
flag = new StyleFlag();

// Установите настройку блокировки.
flag.Locked = true;

// Примените стиль к первому столбцу.
sheet.Cells.Columns[0].ApplyStyle(style, flag);
```

## Защита рабочего листа

Чтобы завершить защиту, нам нужно защитить рабочий лист, чтобы гарантировать невозможность изменения заблокированных столбцов. Вот фрагмент кода:

```csharp
// Защитите лист.
sheet.Protect(ProtectionType.All);
```

## Сохранение файла Excel

Наконец, мы сохраним измененный файл Excel в нужном месте. Вот фрагмент кода:

```csharp
// Сохраните файл Excel.
wb.Save(dataDir + "output.out.xls", SaveFormat.Excel97To2003);
```

Обязательно замените «output.out.xls» нужным именем файла и расширением.

### Пример исходного кода для защиты определенного столбца на листе Excel с использованием Aspose.Cells для .NET 
```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Создайте каталог, если он еще не существует.
bool IsExists = System.IO.Directory.Exists(dataDir);
if (!IsExists)
    System.IO.Directory.CreateDirectory(dataDir);
// Создайте новую рабочую книгу.
Workbook wb = new Workbook();
// Создайте объект рабочего листа и получите первый лист.
Worksheet sheet = wb.Worksheets[0];
// Определите объект стиля.
Style style;
// Определите объект styleflag.
StyleFlag flag;
// Прокрутите все столбцы на листе и разблокируйте их.
for (int i = 0; i <= 255; i++)
{
    style = sheet.Cells.Columns[(byte)i].Style;
    style.IsLocked = false;
    flag = new StyleFlag();
    flag.Locked = true;
    sheet.Cells.Columns[(byte)i].ApplyStyle(style, flag);
}
// Получите первый стиль столбца.
style = sheet.Cells.Columns[0].Style;
// Закрой.
style.IsLocked = true;
//Создайте экземпляр флага.
flag = new StyleFlag();
// Установите настройку блокировки.
flag.Locked = true;
// Примените стиль к первому столбцу.
sheet.Cells.Columns[0].ApplyStyle(style, flag);
// Защитите лист.
sheet.Protect(ProtectionType.All);
// Сохраните файл Excel.
wb.Save(dataDir + "output.out.xls", SaveFormat.Excel97To2003);
```

## Заключение

В этом руководстве мы объяснили пошаговый процесс защиты определенного столбца на листе Excel с помощью библиотеки Aspose.Cells для .NET. Мы начали с создания новой рабочей книги и рабочего листа, определения стилей и объектов флагов стиля, а затем приступили к разблокировке и блокировке определенных столбцов. Наконец, мы защитили лист и сохранили измененный файл Excel. Следуя этому руководству, вы теперь сможете защищать определенные столбцы на листах Excel с помощью C# и Aspose.Cells для .NET.

### Часто задаваемые вопросы (FAQ)

#### Могу ли я защитить несколько столбцов с помощью этого метода?

Да, вы можете защитить несколько столбцов, соответствующим образом изменив код. Просто прокрутите нужный диапазон столбцов и примените стили блокировки и флаги.

#### Можно ли защитить защищенный рабочий лист паролем?

 Да, вы можете добавить защиту паролем к защищенному рабочему листу, указав пароль при вызове`Protect` метод.

#### Поддерживает ли Aspose.Cells for .NET другие форматы файлов Excel?

Да, Aspose.Cells для .NET поддерживает различные форматы файлов Excel, включая XLS, XLSX, XLSM и другие.

#### Могу ли я защитить определенные строки вместо столбцов?

Да, вы можете изменить код для защиты определенных строк, а не столбцов, применяя стили и флаги к ячейкам строк, а не к ячейкам столбцов.