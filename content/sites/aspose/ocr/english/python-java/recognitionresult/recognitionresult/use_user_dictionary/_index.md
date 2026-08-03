---
title: "RecognitionResult.use_user_dictionary"
linktitle: "use_user_dictionary"
articleTitle: "use_user_dictionary"
second_title: "Aspose.OCR for Python via Java"
description: "Allows to use own dictionary for spell-check correction."
type: docs
weight: 10
url: /python-java/recognitionresult/recognitionresult/use_user_dictionary/
---

## RecognitionResult.use_user_dictionary

```python
use_user_dictionary(self, str dictionaryPath)
```


Allows to use own dictionary for spell-check correction.


| Parameter | Type | Description |
| --- | --- | --- |
| `dictionaryPath` | `str` | Full path to the user dictionary (frequency dictionary). Dictionary file format: Plain text file in UTF-8 encoding. Word and Word Frequency are separated by comma, the word is expected in the first column and the frequency in the second column. Every word-frequency-pair in a separate line.A line is defined as a sequence of characters followed by a line feed ("\n"), a carriage return ("\r"), or a carriage return immediately followed by a line feed("\r\n"). Every word is expected to be in lower case. Example: word,5984819 hello,5761742 down,5582768 |
