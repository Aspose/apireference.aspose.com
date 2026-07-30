---
title: "System::String 类"
linktitle: "String"
second_title: "Aspose.Font 适用于 C++"
description: "System::String 类。库中使用的字符串类。是 C# System.String 在代码翻译中的替代品。出于优化原因，它并未被视为 Object 的子类。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 5800
url: /zh/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) 是 C++ 端的值类型，隐式（无继承）实现了一些接口。 |
| [begin](./begin/)() const | 返回指向实际字符串缓冲区起始位置的指针。永不重新分配任何内容。不能保证缓冲区以空字符结尾。 |
| [Clone](./clone/)() const | 创建当前字符串的副本。 |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater-compares 两个子字符串。 |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-compares 两个子字符串。 |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater-compares 两个字符串。 |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater-compares 两个字符串。 |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater-compares 两个字符串。 |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-compares 两个字符串。 |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater-compares 两个字符串，使用序数模式。 |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater-compares 两个字符串，使用序数模式。 |
| [CompareTo](./compareto/)(const String\&) const | 以 'less-equals-more' 风格比较两个字符串。使用当前区域性。 |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | 连接字符串。 |
| static [Concat](./concat/)(const String\&, const String\&) | 连接字符串。 |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | 连接字符串。 |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | 连接字符串。 |
| [Contains](./contains/)(const String\&) const | 检查 str 是否是当前字符串的子串。 |
| [Contains](./contains/)(char16_t) const | 检查字符串是否包含给定字符。 |
| static [Copy](./copy/)(const String\&) | 创建字符串副本。 |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | 将字符串字符复制到现有数组元素中。不进行大小调整。 |
| [end](./end/)() const | 返回指向实际字符串缓冲区末尾的指针。永不重新分配任何内容。不保证缓冲区为 null 终止。 |
| [EndsWith](./endswith/)(const String\&) const | 检查字符串是否以指定子串结尾。 |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | 检查字符串是否以指定子串结尾。 |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 检查字符串是否以指定子串结尾。 |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) 相等比较。由 [StringComparison](../stringcomparison/) 枚举提供的多种模式受支持。 |
| [Equals](./equals/)(const String\&) const | [String](./) 相等比较。使用 [System::StringComparison::Ordinal](../stringcomparison/) 比较模式。 |
| static [Equals](./equals/)(const String\&, const String\&) | Equal-compares 两个字符串，使用 Ordial 比较模式。 |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equal-compares 两个字符串。 |
| [FastToAscii](./fasttoascii/)(char, int) const | 尝试将 [String](./) 转换为 ASCII 字符串。 |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | 以 C# 风格格式化字符串。 |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | 以 C# 风格格式化字符串。 |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | 以 C# 风格格式化字符串。 |
| static [Format](./format/)(const String\&, const Args\&...) | 以 C# 风格格式化字符串。 |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | 以 C# 风格格式化字符串。 |
| static [FromAscii](./fromascii/)(const char *) | 从 ASCII 字符串创建 [String](./)。 |
| static [FromAscii](./fromascii/)(const char *, int) | 从 ASCII 字符串创建 [String](./)。 |
| static [FromAscii](./fromascii/)(const std::string\&) | 从 ASCII 字符串创建 [String](./)。 |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | 从 utf16 字符串创建 [String](./)。 |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | 从 utf32 字符串创建 [String](./)。 |
| static [FromUtf8](./fromutf8/)(const char *) | 从 utf8 字符串创建 [String](./)。 |
| static [FromUtf8](./fromutf8/)(const char *, int) | 从 utf8 字符串创建 [String](./)。 |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | 从 utf8 字符串创建 [String](./)。 |
| static [FromUtf8](./fromutf8/)(const std::string\&) | 从 utf8 字符串创建 [String](./)。 |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | 从 widestring 创建 [String](./)。 |
| [get_Length](./get_length/)() const | 获取字符串长度。 |
| [GetHashCode](./gethashcode/)() const | 对包含的字符串进行哈希。实现于 ICU，哈希值与 C# 中的不匹配。 |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | 子串前向查找。 |
| [IndexOf](./indexof/)(char_t, int) const | 字符向前查找。 |
| [IndexOf](./indexof/)(char_t, int, int) const | 子串中的字符向前查找。 |
| [IndexOf](./indexof/)(const String\&, int) const | 子串前向查找。 |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | 子串前向查找。 |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | 子串前向查找。 |
| [IndexOf](./indexof/)(const String\&, int, int) const | 子串前向查找。 |
| [IndexOfAny](./indexofany/)(char_t, int) const | 字符向前查找。 |
| [IndexOfAny](./indexofany/)(const String\&, int) const | 因此在此字符串中查找 str 的所有字符。如果找到第一个字符，则返回其位置，否则继续查找第二个字符，以此类推。 |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | 在整个字符串中查找传入的任意字符。将字符串的第一个字符与 anyOf 中的所有字符比较，然后比较第二个字符，依此类推。返回第一个匹配任意目标字符的索引。 |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | 在子串中查找传入的任意字符。将字符串的第一个字符与 anyOf 中的所有字符比较，然后比较第二个字符，依此类推。返回第一个匹配任意目标字符的索引。 |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | 在子串中查找传入的任意字符。将字符串的第一个字符与 anyOf 中的所有字符比较，然后比较第二个字符，依此类推。返回第一个匹配任意目标字符的索引。 |
| [Insert](./insert/)(int, const String\&) const | 在指定位置插入子串。 |
| [Is](./is/)(const System::TypeInfo\&) const | 检查字符串对象是否为传入的由 [TypeInfo](../typeinfo/) 指定的类型。 |
| [IsAsciiString](./isasciistring/)() const | 指示一个 [String](./) 是否仅包含 ASCII 符号。 |
| [IsEmpty](./isempty/)() const | 检查字符串是否为非 null 且为空。 |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | 检查 Unicode 字符串是否已使用指定的规范化形式进行规范化。 |
| [IsNull](./isnull/)() const | 检查字符串是否被视为 null。只有在通过 [String()](./string/) 构造函数创建、移动、复制或从 null 字符串赋值，或调用了 [reset()](./reset/) 方法时，[String](./) 才被认为是 null。 |
| [IsNullOrEmpty](./isnullorempty/)() const | 检查字符串是否为空或被视为 null。 |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | 检查传入的字符串是否为 null 或为空。 |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | 指示指定的字符串是 null、为空，还是仅由空白字符组成。 |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | 使用字符串作为分隔符连接数组。 |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | 使用字符串作为分隔符连接数组。 |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | 使用字符串作为分隔符连接数组。 |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | 使用字符串作为分隔符连接数组。 |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | 子串向后查找。 |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | 子串向后查找。 |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | 子串向后查找。 |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | 子串向后查找。 |
| [LastIndexOf](./lastindexof/)(char_t) const | 字符向后查找。 |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | 字符向后查找。 |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | 字符向后查找。 |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | 在整个字符串中向后查找传入的任意字符。将字符串的最后一个字符与 anyOf 中的所有字符比较，然后比较前一个字符，依此类推。返回找到的第一个匹配的索引。 |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | 在子串中向后查找传入的任意字符。将字符串的最后一个字符与 anyOf 中的所有字符比较，然后比较前一个字符，依此类推。返回找到的第一个匹配的索引。 |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | 在子串中向后查找传入的任意字符。将字符串的最后一个字符与 anyOf 中的所有字符比较，然后比较前一个字符，依此类推。返回找到的第一个匹配的索引。 |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | 使用指定的规范化形式对 Unicode 字符串进行规范化。 |
| [operator!=](./operator!=/)(const String\&) const | 非相等比较运算符。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 检查字符串是否不为 null。采用与 [IsNull()](./isnull/) 调用相同的逻辑。 |
| [operator+](./operator+/)(const String\&) const | [String](./) 连接运算符。 |
| [operator+](./operator+/)(const T\&) const | [String](./) 与字符串字面量或字符字符串指针的连接。 |
| [operator+](./operator+/)(char_t) const | 在字符串末尾添加字符。 |
| [operator+](./operator+/)(int) const | 在字符串末尾添加整数值的字符串表示。 |
| [operator+](./operator+/)(uint32_t) const | 在字符串末尾添加无符号整数值的字符串表示。 |
| [operator+](./operator+/)(double) const | 在字符串末尾添加浮点值的字符串表示。 |
| [operator+](./operator+/)(int64_t) const | 在字符串末尾添加整数值的字符串表示。 |
| [operator+](./operator+/)(const T\&) const | 在字符串末尾添加引用类型对象的字符串表示。 |
| [operator+](./operator+/)(const T\&) const | 在字符串末尾添加引用类型对象的字符串表示。 |
| [operator+](./operator+/)(T) const | 在字符串末尾添加布尔值的字符串表示。 |
| [operator+=](./operator+=/)(char_t) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(const String\&) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(double) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(uint8_t) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(int16_t) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(uint16_t) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(int32_t) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(uint32_t) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(int64_t) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(uint64_t) | 连接赋值运算符。 |
| [operator+=](./operator+=/)(T) | 连接赋值运算符。 |
| [operator<](./operator_/)(const String\&) const | 对字符串进行顺序比较。 |
| [operator=](./operator=/)(const String\&) | 赋值运算符。 |
| [operator=](./operator=/)(String\&&) | 移动赋值运算符。 |
| [operator==](./operator==/)(const String\&) const | 相等比较运算符。 |
| [operator==](./operator==/)(std::nullptr_t) const | 检查字符串是否为 null。使用与 [IsNull()](./isnull/) 调用相同的逻辑。 |
| [operator>](./operator_/)(const String\&) const | 对字符串进行顺序比较。 |
| [operator[]](./operator[]/)(int) const | 获取指定位置的字符。 |
| [PadLeft](./padleft/)(int, char_t) const | 在原始字符串左侧添加填充。 |
| [PadRight](./padright/)(int, char_t) const | 在原始字符串右侧添加填充。 |
| [rbegin](./rbegin/)() const | 返回指向实际字符串缓冲区最后一个字符（如果有）的逆向迭代器。 |
| [Remove](./remove/)(int32_t, int32_t) const | 从当前字符串中提取除子串之外的所有内容。 |
| [rend](./rend/)() const | 返回指向实际字符串缓冲区第一个字符之前的逆向迭代器（如果有）。 |
| [Replace](./replace/)(char_t, char_t) const | 替换字符串中所有出现的字符。 |
| [Replace](./replace/)(const String\&, const String\&) const | 替换此字符串中所有出现的查找项。 |
| [reset](./reset/)() | 将字符串设为 null。相当于 C# 中的 `'string_variable_name = null'`。 |
| [SetCharAt](./setcharat/)(int, char_t) | 在指定位置设置字符。 |
| [Split](./split/)(char_t, StringSplitOptions) const | 按字符拆分字符串。 |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | 按字符拆分字符串。 |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | 按两个字符中的任意一个拆分字符串。 |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | 按指定的任意字符拆分字符串。 |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | 按指定的任意字符拆分字符串。 |
| [Split](./split/)(const String\&, StringSplitOptions) const | 按子串拆分字符串。 |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | 按子串拆分字符串。 |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | 按子串拆分字符串。 |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | 按子字符串拆分字符串。目前，仅支持零或一个元素的分隔符数组。 |
| [StartsWith](./startswith/)(const String\&) const | 检查字符串是否以指定子字符串开头。 |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | 检查字符串是否以指定子字符串开头。 |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 检查字符串是否以指定子字符串开头。 |
| [String](./string/)() | 默认构造函数。创建被视为 null 的字符串对象。 |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | 基于字符串字面量构造字符串。将字面量视为以 null 结尾的字符串，依据字面量大小计算目标字符串长度。 |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | 基于字符字符串指针构造字符串。将指向的字符串视为以 null 结尾，依据 null 字符计算目标字符串长度。 |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | 基于字符串字面量构造字符串。将字面量视为 UTF8 编码的以 null 结尾的字符串，依据字面量大小计算目标字符串长度。 |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | 基于字符字符串指针构造字符串。将指向的字符串视为 UTF8 编码的以 null 结尾，依据 null 字符计算目标字符串长度。 |
| [String](./string/)(const char16_t *, int) | 从字符字符串指针和显式长度构造字符串。 |
| [String](./string/)(const char *, int) | 从字符字符串指针和显式长度构造字符串。 |
| [String](./string/)(const char16_t *, int, int) | 从起始位置的字符字符串指针使用长度构造字符串。 |
| explicit [String](./string/)(const char16_t, int) | 填充构造函数。 |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | nullptr 构造函数。声明为模板以解决与其他模板构造函数的优先级冲突。 |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | 基于宽字符串字面量构造字符串。将字面量视为以 null 结尾的字符串，依据字面量大小计算目标字符串长度。某些平台上 wchar_t 的转换耗时较长，因此不允许隐式转换。 |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | 基于宽字符字符串指针构造字符串。将指向的字符串视为以 null 结尾，依据 null 字符计算目标字符串长度。某些平台上 wchar_t 的转换耗时较长，因此不允许隐式转换。 |
| explicit [String](./string/)(const wchar_t *, int) | 从宽字符字符串指针和显式长度构造字符串。某些平台上 wchar_t 的转换耗时较长，因此不允许隐式转换。 |
| explicit [String](./string/)(const wchar_t, int) | 填充构造函数。某些平台上 wchar_t 的转换耗时较长，因此不允许隐式转换。 |
| [String](./string/)(const String\&) | 拷贝构造函数。 |
| [String](./string/)(String\&&) | 移动构造函数。 |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | 将整个字符数组转换为字符串。 |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | 将字符数组子范围转换为字符串。如果参数超出数组边界，则构造空字符串。 |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | 将 UnicodeString 包装为 [String](./)。 |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | 移动构造函数。 |
| explicit [String](./string/)(const std::wstring\&) | 从 widestring 创建 [String](./)。 |
| explicit [String](./string/)(const std::u16string\&) | 从 utf16 字符串创建 [String](./)。 |
| explicit [String](./string/)(const std::string\&) | 从 UTF-8 格式的 std::string 字符串创建 [String](./)。 |
| explicit [String](./string/)(const std::u32string\&) | 从 std::u32string 字符串创建 [String](./)。 |
| [Substring](./substring/)(int32_t) const | 提取子字符串。 |
| [Substring](./substring/)(int32_t, int32_t) const | 提取子字符串。 |
| [ToAsciiString](./toasciistring/)() const | 将字符串转换为 std::string。使用 ASCII 编码。 |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | 将字符串或子字符串转换为字节数组。 |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | 将字符串或子字符串转换为字符数组。 |
| [ToLower](./tolower/)() const | 将所有字符串字符转换为小写。 |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 使用特定文化将所有字符串的字符转换为小写。 |
| [ToLowerInvariant](./tolowerinvariant/)() const | 使用不变文化将所有字符串的字符转换为小写。 |
| [ToString](./tostring/)() const | 在值类型对象上调用 [ToString()](./tostring/) 的上下文中，用于处理 [String](./) 类的包装器。 |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 在值类型对象上调用 [ToString()](./tostring/) 的上下文中，用于处理 [String](./) 类的包装器。 |
| [ToU16Str](./tou16str/)() const | 将字符串转换为 std::u16string。 |
| [ToU32Str](./tou32str/)() const | 将字符串转换为 std::u32string。 |
| [ToUpper](./toupper/)() const | 将所有字符串的字符转换为大写。 |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 使用特定文化将所有字符串的字符转换为大写。 |
| [ToUpperInvariant](./toupperinvariant/)() const | 使用不变文化将所有字符串的字符转换为大写。 |
| [ToUtf8String](./toutf8string/)() const | 将字符串转换为 std::string。使用 UTF-8 编码。 |
| [ToWCS](./towcs/)() const | 将字符串转换为 std::wstring。 |
| [Trim](./trim/)() const | 删除字符串开头和结尾的所有空白字符。 |
| [Trim](./trim/)(char_t) const | 删除字符串开头和结尾传入字符的所有出现。 |
| [Trim](./trim/)(const String\&) const | 删除字符串开头和结尾传入字符集的所有出现。 |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | 删除字符串开头和结尾传入字符集的所有出现。 |
| [TrimEnd](./trimend/)() const | 删除字符串结尾的所有空白字符。 |
| [TrimEnd](./trimend/)(char_t) const | 删除字符串结尾传入字符的所有出现。 |
| [TrimEnd](./trimend/)(const String\&) const | 删除字符串结尾传入字符集的所有出现。 |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | 删除字符串结尾传入字符集的所有出现。 |
| [TrimStart](./trimstart/)() const | 删除字符串开头的所有空白字符。 |
| [TrimStart](./trimstart/)(char_t) const | 删除字符串开头传入字符的所有出现。 |
| [TrimStart](./trimstart/)(const String\&) const | 删除字符串开头传入字符集的所有出现。 |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | 删除字符串开头传入字符集的所有出现。 |
| [u_str](./u_str/)() const | 返回 ICU 风格的以空字符结尾的缓冲区。可能会重新分配字符串。 |
| [~String](./~string/)() | 析构函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 空字符串。 |
| static [Null](./null/) | 空（null）字符串。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | 反向迭代器类型。 |
## 备注



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // 从字符数组构造字符串并打印它。
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // 从字节数组构造字符串并打印它。
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // 修剪下面的字符串并打印它。
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // 打印 . 中的单词数。
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
