---
title: Aspose::Words::LineNumberRestartMode enum
linktitle: LineNumberRestartMode
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::LineNumberRestartMode enum. Determines when automatic line numbering restarts in C++.'
type: docs
weight: 94000
url: /cpp/aspose.words/linenumberrestartmode/
---
## LineNumberRestartMode enum


Determines when automatic line numbering restarts.

```cpp
enum class LineNumberRestartMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| RestartPage | 0 | Line numbering restarts at the start of every page. |
| RestartSection | 1 | Line numbering restarts at the section start. |
| Continuous | 2 | Line numbering continuous from the previous section. |


## Examples



Shows how to enable line numbering for a section. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// We can use the section's PageSetup object to display numbers to the left of the section's text lines.
// This is the same behavior as a List object,
// but it covers the entire section and does not modify the text in any way.
// Our section will restart the numbering on each new page from 1 and display the number,
// if it is a multiple of 3, at 50pt to the left of the line.
System::SharedPtr<Aspose::Words::PageSetup> pageSetup = builder->get_PageSetup();
pageSetup->set_LineStartingNumber(1);
pageSetup->set_LineNumberCountBy(3);
pageSetup->set_LineNumberRestartMode(Aspose::Words::LineNumberRestartMode::RestartPage);
pageSetup->set_LineNumberDistanceFromText(50.0);

for (int32_t i = 1; i <= 25; i++)
{
    builder->Writeln(System::String::Format(u"Line {0}.", i));
}

// The line counter will skip any paragraph with the "SuppressLineNumbers" flag set to "true".
// This paragraph is on the 15th line, which is a multiple of 3, and thus would normally display a line number.
// The section's line counter will also ignore this line, treat the next line as the 15th,
// and continue the count from that point onward.
doc->get_FirstSection()->get_Body()->get_Paragraphs()->idx_get(14)->get_ParagraphFormat()->set_SuppressLineNumbers(true);

doc->Save(get_ArtifactsDir() + u"PageSetup.LineNumbers.docx");
```

## See Also

* Namespace [Aspose::Words](../)
* Library [Aspose.Words for C++](../../)
