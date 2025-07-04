---
title: Aspose::Words::Fields::FieldIfComparisonResult enum
linktitle: FieldIfComparisonResult
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fields::FieldIfComparisonResult enum. Specifies the result of the IF field condition evaluation in C++.'
type: docs
weight: 128000
url: /cpp/aspose.words.fields/fieldifcomparisonresult/
---
## FieldIfComparisonResult enum


Specifies the result of the IF field condition evaluation.

```cpp
enum class FieldIfComparisonResult
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Error | 0 | There is an error in the condition. |
| True | 1 | The condition is **true**. |
| False | 2 | The condition is **false**. |


## Examples



Shows how to insert an IF field. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

builder->Write(u"Statement 1: ");
auto field = System::ExplicitCast<Aspose::Words::Fields::FieldIf>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldIf, true));
field->set_LeftExpression(u"0");
field->set_ComparisonOperator(u"=");
field->set_RightExpression(u"1");

// The IF field will display a string from either its "TrueText" property,
// or its "FalseText" property, depending on the truth of the statement that we have constructed.
field->set_TrueText(u"True");
field->set_FalseText(u"False");
field->Update();

// In this case, "0 = 1" is incorrect, so the displayed result will be "False".
ASSERT_EQ(u" IF  0 = 1 True False", field->GetFieldCode());
ASSERT_EQ(Aspose::Words::Fields::FieldIfComparisonResult::False, field->EvaluateCondition());
ASSERT_EQ(u"False", field->get_Result());

builder->Write(u"\nStatement 2: ");
field = System::ExplicitCast<Aspose::Words::Fields::FieldIf>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldIf, true));
field->set_LeftExpression(u"5");
field->set_ComparisonOperator(u"=");
field->set_RightExpression(u"2 + 3");
field->set_TrueText(u"True");
field->set_FalseText(u"False");
field->Update();

// This time the statement is correct, so the displayed result will be "True".
ASSERT_EQ(u" IF  5 = \"2 + 3\" True False", field->GetFieldCode());
ASSERT_EQ(Aspose::Words::Fields::FieldIfComparisonResult::True, field->EvaluateCondition());
ASSERT_EQ(u"True", field->get_Result());

doc->UpdateFields();
doc->Save(get_ArtifactsDir() + u"Field.IF.docx");
```

## See Also

* Namespace [Aspose::Words::Fields](../)
* Library [Aspose.Words for C++](../../)
