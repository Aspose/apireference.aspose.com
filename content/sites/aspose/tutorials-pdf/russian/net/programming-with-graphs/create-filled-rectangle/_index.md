---
title: Создать заполненный прямоугольник
linktitle: Создать заполненный прямоугольник
second_title: Aspose.PDF для справочника API .NET
description: Узнайте, как создать прямоугольник с заливкой с помощью Aspose.PDF для .NET. Пошаговое руководство по настройке цвета заливки.
type: docs
weight: 50
url: /ru/net/programming-with-graphs/create-filled-rectangle/
---
В этом руководстве мы шаг за шагом проведем вас через следующий исходный код C#, чтобы создать прямоугольник с заливкой, используя Aspose.PDF для .NET.

Прежде чем начать, убедитесь, что вы установили библиотеку Aspose.PDF и настроили среду разработки. Также есть базовые знания программирования на C#.

## Шаг 1: Настройка каталога документов

В предоставленном исходном коде вам необходимо указать каталог, в котором вы хотите сохранить полученный PDF-файл. Измените переменную «dataDir» на нужный каталог.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Шаг 2: Создание экземпляра документа и добавление страницы

Мы создаем экземпляр класса Document и добавляем в этот документ страницу.

```csharp
Document doc = new Document();
Page page = doc.Pages.Add();
```

## Шаг 3: Создание объекта графика и добавление его на страницу

Мы создаем объект Graph с указанными размерами и добавляем его в коллекцию абзацев страницы.

```csharp
Aspose.Pdf.Drawing.Graph graph = new Aspose.Pdf.Drawing.Graph(100, 400);
page.Paragraphs.Add(graph);
```

## Шаг 4: Создайте прямоугольный объект и добавьте его в диаграмму

Мы создаем объект Rectangle с указанными размерами и добавляем его в коллекцию фигур диаграммы.

```csharp
Aspose.Pdf.Drawing.Rectangle rect = new Aspose.Pdf.Drawing.Rectangle(100, 100, 200, 120);
graph.Shapes.Add(rect);
```

## Шаг 5: Установка цвета заливки

Мы можем указать цвет заливки для прямоугольника, используя свойство FillColor объекта GraphInfo.

```csharp
rect.GraphInfo.FillColor = Aspose.Pdf.Color.Red;
```

## Шаг 6: Сохранение полученного PDF-файла

Наконец, мы сохраняем полученный файл PDF с именем «CreateFilledRectangle_out.pdf» в указанном каталоге.

```csharp
doc.Save(dataDir + "CreateFilledRectangle_out.pdf");
```

### Пример исходного кода для создания заполненного прямоугольника с использованием Aspose.PDF для .NET 

```csharp

// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Создать экземпляр документа
Document doc = new Document();
// Добавить страницу в коллекцию страниц файла PDF
Page page = doc.Pages.Add();
// Создать экземпляр графа
Aspose.Pdf.Drawing.Graph graph = new Aspose.Pdf.Drawing.Graph(100, 400);
// Добавить объект графика в коллекцию абзацев экземпляра страницы
page.Paragraphs.Add(graph);
// Создать экземпляр прямоугольника
Aspose.Pdf.Drawing.Rectangle rect = new Aspose.Pdf.Drawing.Rectangle(100, 100, 200, 120);
// Укажите цвет заливки для объекта Graph
rect.GraphInfo.FillColor = Aspose.Pdf.Color.Red;
// Добавить прямоугольный объект в коллекцию фигур объекта Graph
graph.Shapes.Add(rect);
dataDir = dataDir + "CreateFilledRectangle_out.pdf";
// Сохранить PDF-файл
doc.Save(dataDir);
Console.WriteLine("\nFilled rectangle object created successfully.\nFile saved at " + dataDir);            

```

## Заключение

В этом руководстве мы объяснили, как создать прямоугольник с заливкой, используя Aspose.PDF для .NET. Теперь вы можете использовать эти знания для создания геометрических фигур с пользовательскими цветами заливки в ваших файлах PDF.

## Часто задаваемые вопросы

#### В: Какова цель этого урока?

О: Цель этого руководства — провести вас через процесс создания прямоугольника с заливкой с помощью Aspose.PDF для .NET, что позволит вам добавлять пользовательские геометрические фигуры с цветами заливки в файлы PDF.

#### В: Какие предварительные условия необходимы перед запуском?

О: Прежде чем начать, убедитесь, что вы установили библиотеку Aspose.PDF и настроили среду разработки. Кроме того, рекомендуется иметь базовые знания программирования на C#.

#### В: Как указать каталог для сохранения файла PDF?

О: В предоставленном исходном коде вы можете изменить переменную «dataDir», чтобы указать каталог, в котором вы хотите сохранить полученный PDF-файл.

#### В: Каково назначение объекта Graph?

A: Объект Graph действует как контейнер для элементов рисования. Он создается с заданными размерами и добавляется в коллекцию абзацев страницы.

#### Q: Как я могу добавить заполненный прямоугольник в документ PDF?

О. Чтобы добавить прямоугольник с заливкой, создайте экземпляр класса Rectangle с указанными размерами и цветом заливки и добавьте его в коллекцию фигур графика.

#### В: Могу ли я настроить размеры и цвет заливки прямоугольника?

 О: Да, вы можете настроить размеры и цвет заливки прямоугольника, изменив параметры, переданные в`Aspose.Pdf.Drawing.Rectangle` конструктор и установка свойства FillColor.

#### В: Как сохранить полученный PDF-файл после создания прямоугольника с заливкой?

 A: После создания заполненного прямоугольника вы можете сохранить полученный PDF-файл, используя кнопку`doc.Save(dataDir + "CreateFilledRectangle_out.pdf");` строка в предоставленном исходном коде.