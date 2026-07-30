---
title: "Класс System::Text::RegularExpressions::Regex"
linktitle: "Regex"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::RegularExpressions::Regex. Регулярное выражение, использующее синтаксис, похожий на C#. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 800
url: /ru/cpp/system.text.regularexpressions/regex/
---
## Regex class


Регулярное выражение, использующее синтаксис, похожий на C#. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Regex : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Экранирует специальные символы, чтобы использовать строку как часть шаблона. |
| [get_MatchTimeout](./get_matchtimeout/)() | Возвращает тайм‑аут сопоставления. |
| [get_Options](./get_options/)() | Возвращает параметры regex. |
| [get_RightToLeft](./get_righttoleft/)() | Проверяет, выполняется ли сопоставление в режиме справа налево. |
| [IsMatch](./ismatch/)(const String\&, int) | Сравнивает regex со строкой. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Проверяет, соответствует ли строка шаблону. |
| [Match](./match/)(const String\&) | Сравнивает regex со строкой. |
| [Match](./match/)(const String\&, int, int) | Сравнивает regex со строкой. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Сравнивает строку и шаблон. |
| [Matches](./matches/)(const String\&, int) | Возвращает все совпадения regex в заданной строке путем повторного сопоставления. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Возвращает все совпадения между строкой и шаблоном. |
| [Regex](./regex/)() | Создаёт пустое регулярное выражение. |
| [Regex](./regex/)(const String\&) | Конструктор. |
| [Regex](./regex/)(const String\&, RegexOptions) | Конструктор. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Конструктор. |
| [Replace](./replace/)(const String\&, const String\&) | Заменяет все совпадения regex в строке строкой‑заменой. |
| [Replace](./replace/)(const String\&, const char_t *) | Заменяет все совпадения regex в строке строкой‑заменой. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Заменяет все совпадения regex в строке строкой‑заменой. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Заменяет все совпадения regex в строке строкой‑заменой. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Заменяет все совпадения в строке строками‑заменами, сгенерированными делегатом. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Заменяет все совпадения в строке строками‑заменами, сгенерированными делегатом. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Заменяет все совпадения в строке строками‑заменами, сгенерированными делегатом. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Заменяет все совпадения в строке строками‑заменителями, сгенерированными делегатом (статическая функция). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Заменяет все совпадения regex в строке строкой‑заменой. |
| [Replace](./replace/)(const String\&, const String\&, int) | Заменяет подстроки в строке. Не реализовано. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Заменяет подстроки в строке. Не реализовано. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Заменяет совпадения регулярного выражения. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Заменяет совпадения регулярного выражения. |
| [Split](./split/)(const String\&) | Разбивает строку по совпадениям регулярного выражения. |
| [Split](./split/)(const String\&, int) | Разбивает строку по совпадениям регулярного выражения. |
| [Split](./split/)(const String\&, int, int) | Разбивает входную строку заданное максимальное количество раз на массив подстрок в позициях, определённых регулярным выражением, указанным в конструкторе [Regex](./). Поиск шаблона регулярного выражения начинается с указанной позиции символа во входной строке. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Разбивает строку по регулярному выражению. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Разбивает строку по регулярному выражению. |
| [ToString](./tostring/)() const override | Преобразует регулярное выражение в строку. |
| static [Unescape](./unescape/)(const String\&) | Удаляет экранирование специальных символов в строке, используемой как часть шаблона. |
## Поля

| Поле | Описание |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Специальное значение тайм‑аута для отключения прерывания совпадения по тайм‑ауту. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
