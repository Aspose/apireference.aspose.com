---
title: Aspose::Words::Fields::FormField class
linktitle: FormField
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fields::FormField class. Represents a single form field. To learn more, visit the  documentation article in C++.'
type: docs
weight: 112000
url: /cpp/aspose.words.fields/formfield/
---
## FormField class


Represents a single form field. To learn more, visit the [Working with Form Fields](https://docs.aspose.com/words/cpp/working-with-form-fields/) documentation article.

```cpp
class FormField : public Aspose::Words::SpecialChar
```

## Methods

| Method | Description |
| --- | --- |
| [Accept](./accept/)(System::SharedPtr\<Aspose::Words::DocumentVisitor\>) override | Accepts a visitor. |
| [Clone](../../aspose.words/node/clone/)(bool) | Creates a duplicate of the node. |
| [get_CalculateOnExit](./get_calculateonexit/)() | True if references to the specified form field are automatically updated whenever the field is exited. |
| [get_CheckBoxSize](./get_checkboxsize/)() | Gets or sets the size of the checkbox in points. Has effect only when [IsCheckBoxExactSize](./get_ischeckboxexactsize/) is **true**. |
| [get_Checked](./get_checked/)() | Gets or sets the checked status of the check box form field. Default value for this property is **false**. |
| [get_CustomNodeId](../../aspose.words/node/get_customnodeid/)() const | Specifies custom node identifier. |
| [get_Default](./get_default/)() | Gets or sets the default value of the check box form field. Default value for this property is **false**. |
| virtual [get_Document](../../aspose.words/node/get_document/)() const | Gets the document to which this node belongs. |
| [get_DropDownItems](./get_dropdownitems/)() | Provides access to the items of a dropdown form field. |
| [get_DropDownSelectedIndex](./get_dropdownselectedindex/)() | Gets the index specifying the currently selected item in a dropdown form field. |
| [get_Enabled](./get_enabled/)() | True if a form field is enabled. |
| [get_EntryMacro](./get_entrymacro/)() | Returns or sets an entry macro name for the form field. |
| [get_ExitMacro](./get_exitmacro/)() | Returns or sets an exit macro name for the form field. |
| [get_Font](../../aspose.words/inline/get_font/)() | Provides access to the font formatting of this object. |
| [get_HelpText](./get_helptext/)() | Returns or sets the text that's displayed in a message box when the form field has the focus and the user presses F1. |
| [get_IsCheckBoxExactSize](./get_ischeckboxexactsize/)() | Gets or sets the boolean value that indicates whether the size of the textbox is automatic or specified explicitly. |
| virtual [get_IsComposite](../../aspose.words/node/get_iscomposite/)() | Returns **true** if this node can contain other nodes. |
| [get_IsDeleteRevision](../../aspose.words/inline/get_isdeleterevision/)() | Returns true if this object was deleted in Microsoft Word while change tracking was enabled. |
| [get_IsFormatRevision](../../aspose.words/inline/get_isformatrevision/)() | Returns true if formatting of the object was changed in Microsoft Word while change tracking was enabled. |
| [get_IsInsertRevision](../../aspose.words/inline/get_isinsertrevision/)() | Returns true if this object was inserted in Microsoft Word while change tracking was enabled. |
| [get_IsMoveFromRevision](../../aspose.words/inline/get_ismovefromrevision/)() | Returns **true** if this object was moved (deleted) in Microsoft Word while change tracking was enabled. |
| [get_IsMoveToRevision](../../aspose.words/inline/get_ismovetorevision/)() | Returns **true** if this object was moved (inserted) in Microsoft Word while change tracking was enabled. |
| [get_MaxLength](./get_maxlength/)() | Maximum length for the text field. Zero when the length is not limited. |
| [get_Name](./get_name/)() | Gets or sets the form field name. |
| [get_NextNode](../../aspose.words/node/get_nextnode/)() const |  |
| [get_NextSibling](../../aspose.words/node/get_nextsibling/)() | Gets the node immediately following this node. |
| [get_NodeType](./get_nodetype/)() const override | Returns [FormField](../../aspose.words/nodetype/). |
| [get_OwnHelp](./get_ownhelp/)() | Specifies the source of the text that's displayed in a message box when a form field has the focus and the user presses F1. |
| [get_OwnStatus](./get_ownstatus/)() | Specifies the source of the text that's displayed in the status bar when a form field has the focus. |
| [get_ParentNode](../../aspose.words/node/get_parentnode/)() | Gets the immediate parent of this node. |
| [get_ParentParagraph](../../aspose.words/inline/get_parentparagraph/)() | Retrieves the parent [Paragraph](../../aspose.words/paragraph/) of this node. |
| [get_PreviousSibling](../../aspose.words/node/get_previoussibling/)() | Gets the node immediately preceding this node. |
| [get_PrevNode](../../aspose.words/node/get_prevnode/)() const |  |
| [get_Range](../../aspose.words/node/get_range/)() | Returns a [Range](../../aspose.words/range/) object that represents the portion of a document that is contained in this node. |
| [get_Result](./get_result/)() | Gets or sets a string that represents the result of this form field. |
| [get_StatusText](./get_statustext/)() | Returns or sets the text that's displayed in the status bar when a form field has the focus. |
| [get_TextInputDefault](./get_textinputdefault/)() | Gets or sets the default string or a calculation expression of a text form field. |
| [get_TextInputFormat](./get_textinputformat/)() | Returns or sets the text formatting for a text form field. |
| [get_TextInputType](./get_textinputtype/)() | Gets the type of a text form field. |
| [get_Type](./get_type/)() | Returns the form field type. |
| [GetAncestor](../../aspose.words/node/getancestor/)(Aspose::Words::NodeType) | Gets the first ancestor of the specified [NodeType](../../aspose.words/nodetype/). |
| [GetAncestorOf](../../aspose.words/node/getancestorof/)() |  |
| [GetText](../../aspose.words/specialchar/gettext/)() override | Gets the special character that this node represents. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [IsAncestorNode](../../aspose.words/node/isancestornode/)(const System::SharedPtr\<Aspose::Words::Node\>\&) |  |
| [NextPreOrder](../../aspose.words/node/nextpreorder/)(const System::SharedPtr\<Aspose::Words::Node\>\&) | Gets next node according to the pre-order tree traversal algorithm. |
| static [NodeTypeToString](../../aspose.words/node/nodetypetostring/)(Aspose::Words::NodeType) | A utility method that converts a node type enum value into a user friendly string. |
| [PreviousPreOrder](../../aspose.words/node/previouspreorder/)(const System::SharedPtr\<Aspose::Words::Node\>\&) | Gets the previous node according to the pre-order tree traversal algorithm. |
| [Remove](../../aspose.words/node/remove/)() | Removes itself from the parent. |
| [RemoveField](./removefield/)() | Removes the complete form field, not just the form field special character. |
| [set_CalculateOnExit](./set_calculateonexit/)(bool) | Setter for [Aspose::Words::Fields::FormField::get_CalculateOnExit](./get_calculateonexit/). |
| [set_CheckBoxSize](./set_checkboxsize/)(double) | Setter for [Aspose::Words::Fields::FormField::get_CheckBoxSize](./get_checkboxsize/). |
| [set_Checked](./set_checked/)(bool) | Setter for [Aspose::Words::Fields::FormField::get_Checked](./get_checked/). |
| [set_CustomNodeId](../../aspose.words/node/set_customnodeid/)(int32_t) | Setter for [Aspose::Words::Node::get_CustomNodeId](../../aspose.words/node/get_customnodeid/). |
| [set_Default](./set_default/)(bool) | Setter for [Aspose::Words::Fields::FormField::get_Default](./get_default/). |
| [set_DropDownSelectedIndex](./set_dropdownselectedindex/)(int32_t) | Sets the index specifying the currently selected item in a dropdown form field. |
| [set_Enabled](./set_enabled/)(bool) | True if a form field is enabled. |
| [set_EntryMacro](./set_entrymacro/)(const System::String\&) | Setter for [Aspose::Words::Fields::FormField::get_EntryMacro](./get_entrymacro/). |
| [set_ExitMacro](./set_exitmacro/)(const System::String\&) | Setter for [Aspose::Words::Fields::FormField::get_ExitMacro](./get_exitmacro/). |
| [set_HelpText](./set_helptext/)(const System::String\&) | Setter for [Aspose::Words::Fields::FormField::get_HelpText](./get_helptext/). |
| [set_IsCheckBoxExactSize](./set_ischeckboxexactsize/)(bool) | Setter for [Aspose::Words::Fields::FormField::get_IsCheckBoxExactSize](./get_ischeckboxexactsize/). |
| [set_MaxLength](./set_maxlength/)(int32_t) | Maximum length for the text field. Zero when the length is not limited. |
| [set_Name](./set_name/)(const System::String\&) | Setter for [Aspose::Words::Fields::FormField::get_Name](./get_name/). |
| [set_NextNode](../../aspose.words/node/set_nextnode/)(const System::SharedPtr\<Aspose::Words::Node\>\&) |  |
| [set_OwnHelp](./set_ownhelp/)(bool) | Setter for [Aspose::Words::Fields::FormField::get_OwnHelp](./get_ownhelp/). |
| [set_OwnStatus](./set_ownstatus/)(bool) | Setter for [Aspose::Words::Fields::FormField::get_OwnStatus](./get_ownstatus/). |
| [set_PrevNode](../../aspose.words/node/set_prevnode/)(const System::SharedPtr\<Aspose::Words::Node\>\&) |  |
| [set_Result](./set_result/)(const System::String\&) | Setter for [Aspose::Words::Fields::FormField::get_Result](./get_result/). |
| [set_StatusText](./set_statustext/)(const System::String\&) | Setter for [Aspose::Words::Fields::FormField::get_StatusText](./get_statustext/). |
| [set_TextInputDefault](./set_textinputdefault/)(const System::String\&) | Setter for [Aspose::Words::Fields::FormField::get_TextInputDefault](./get_textinputdefault/). |
| [set_TextInputFormat](./set_textinputformat/)(const System::String\&) | Setter for [Aspose::Words::Fields::FormField::get_TextInputFormat](./get_textinputformat/). |
| [set_TextInputType](./set_textinputtype/)(Aspose::Words::Fields::TextFormFieldType) | Sets the type of a text form field. |
| [SetParent](../../aspose.words/node/setparent/)(const System::SharedPtr\<Aspose::Words::Node\>\&) |  |
| [SetTextInputValue](./settextinputvalue/)(const System::SharedPtr\<System::Object\>\&) | Applies the text format specified in [TextInputFormat](./get_textinputformat/) and stores the value in [Result](./get_result/). |
| [ToString](../../aspose.words/node/tostring/)(Aspose::Words::SaveFormat) | Exports the content of the node into a string in the specified format. |
| [ToString](../../aspose.words/node/tostring/)(const System::SharedPtr\<Aspose::Words::Saving::SaveOptions\>\&) | Exports the content of the node into a string using the specified save options. |
| static [Type](./type/)() |  |
## Remarks


Microsoft Word provides the following form fields: checkbox, text input and dropdown (combobox).

[FormField](./) is an inline-node and can only be a child of [Paragraph](../../aspose.words/paragraph/).

[FormField](./) is represented in a document by a special character and positioned as a character within a line of text.

A complete form field in a Word document is a complex structure represented by several nodes: field start, field code such as FORMTEXT, form field data, field separator, field result, field end and a bookmark. To programmatically create form fields in a Word document use [InsertCheckBox()](../), [InsertTextInput()](../) and [InsertComboBox()](../) which make sure all of the form field nodes are created in a correct order and in a suitable state.

## Examples



Shows how to insert a combo box. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

builder->Write(u"Please select a fruit: ");

// Insert a combo box which will allow a user to choose an option from a collection of strings.
System::SharedPtr<Aspose::Words::Fields::FormField> comboBox = builder->InsertComboBox(u"MyComboBox", System::MakeArray<System::String>({u"Apple", u"Banana", u"Cherry"}), 0);

ASSERT_EQ(u"MyComboBox", comboBox->get_Name());
ASSERT_EQ(Aspose::Words::Fields::FieldType::FieldFormDropDown, comboBox->get_Type());
ASSERT_EQ(u"Apple", comboBox->get_Result());

// The form field will appear in the form of a "select" html tag.
doc->Save(get_ArtifactsDir() + u"FormFields.Create.html");
```


Shows how to formatting the entire [FormField](./), including the field value. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Form fields.docx");

System::SharedPtr<Aspose::Words::Fields::FormField> formField = doc->get_Range()->get_FormFields()->idx_get(0);
formField->get_Font()->set_Bold(true);
formField->get_Font()->set_Size(24);
formField->get_Font()->set_Color(System::Drawing::Color::get_Red());

formField->set_Result(u"Aspose.FormField");

doc = Aspose::Words::ApiExamples::DocumentHelper::SaveOpen(doc);

System::SharedPtr<Aspose::Words::Run> formFieldRun = doc->get_FirstSection()->get_Body()->get_FirstParagraph()->get_Runs()->idx_get(1);

ASSERT_EQ(u"Aspose.FormField", formFieldRun->get_Text());
ASPOSE_ASSERT_EQ(true, formFieldRun->get_Font()->get_Bold());
ASPOSE_ASSERT_EQ(24, formFieldRun->get_Font()->get_Size());
ASSERT_EQ(System::Drawing::Color::get_Red().ToArgb(), formFieldRun->get_Font()->get_Color().ToArgb());
```

## See Also

* Class [SpecialChar](../../aspose.words/specialchar/)
* Namespace [Aspose::Words::Fields](../)
* Library [Aspose.Words for C++](../../)
