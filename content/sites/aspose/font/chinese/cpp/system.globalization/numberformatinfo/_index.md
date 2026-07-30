---
title: "System::Globalization::NumberFormatInfo 类"
linktitle: "NumberFormatInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::NumberFormatInfo 类。保存有关如何格式化数字的信息。仅在非只读对象上启用设置操作。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1900
url: /zh/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


保存有关如何格式化数字的信息。仅在非只读对象上启用设置操作。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 克隆格式信息。 |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | 获取货币小数位数。 |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | 获取货币小数分隔符。 |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | 获取货币分组分隔符。 |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | 获取每组货币小数位数。 |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | 获取货币负数模式。 |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | 获取货币正数模式。 |
| [get_CurrencySymbol](./get_currencysymbol/)() const | 获取货币符号。 |
| static [get_CurrentInfo](./get_currentinfo/)() | 获取当前线程文化定义的数字格式信息。 |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | 获取指定数字形状显示方式的值。 |
| static [get_InvariantInfo](./get_invariantinfo/)() | 获取不变文化定义的数字格式信息。 |
| [get_IsReadOnly](./get_isreadonly/)() const | 检查格式是否为只读。 |
| [get_NaNSymbol](./get_nansymbol/)() const | 获取非数字符号。 |
| [get_NativeDigits](./get_nativedigits/)() const | 获取数字符号（0 到 9）。 |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | 获取负无穷符号。 |
| [get_NegativeSign](./get_negativesign/)() const | 获取负号。 |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | 获取小数位数。 |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | 获取小数分隔符。 |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | 获取数字组分隔符。 |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | 获取每组的数字位数。 |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | 获取数字负数模式。 |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | 获取百分比值的小数位数。 |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | 获取百分比值的小数分隔符。 |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | 获取百分比值的组分隔符。 |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | 获取每个百分比值组的数字位数。 |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | 获取百分比负数模式。 |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | 获取百分比正数模式。 |
| [get_PercentSymbol](./get_percentsymbol/)() const | 获取百分比符号。 |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | 获取千分号。 |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | 获取正无穷符号。 |
| [get_PositiveSign](./get_positivesign/)() const | 获取正号。 |
| [GetFormat](./getformat/)(const TypeInfo\&) override | 获取特定类型的格式化程序。 |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | 获取与格式提供程序关联的格式化程序。 |
| [NumberFormatInfo](./numberformatinfo/)() | 默认构造函数（不变的 [NumberFormatInfo](./)）。 |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | 获取格式化程序的只读版本。 |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | 设置货币小数位数。 |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | 设置货币小数分隔符。 |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | 设置货币分组分隔符。 |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | 设置每组货币小数位数。 |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | 设置货币负数模式。 |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | 设置货币正数模式。 |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | 设置货币符号。 |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | 设置指定数字形状显示方式的值。 |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | 设置非数字（NaN）符号。 |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | 设置数字符号（0 到 9）。 |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | 设置负无穷符号。 |
| [set_NegativeSign](./set_negativesign/)(const String\&) | 设置负号。 |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | 设置小数位数。 |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | 设置小数分隔符。 |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | 设置数字分组分隔符。 |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | 设置每组数字的位数。 |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | 设置数字负数模式。 |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | 设置百分比值的小数位数。 |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | 设置百分比值的小数分隔符。 |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | 设置百分比值的分组分隔符。 |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | 设置每个百分比值组的数字位数。 |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | 设置百分比负数模式。 |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | 设置百分比正数模式。 |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | 设置百分比符号。 |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | 设置千分号符号。 |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | 设置正无穷符号。 |
| [set_PositiveSign](./set_positivesign/)(const String\&) | 设置正号。 |
## 另见

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
