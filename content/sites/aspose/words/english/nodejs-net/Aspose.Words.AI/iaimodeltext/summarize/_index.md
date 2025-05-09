﻿---
title: IAiModelText.summarize method
linktitle: summarize method
articleTitle: summarize method
second_title: Aspose.Words for Node.js
description: "Aspose.Words.AI.IAiModelText.summarize method"
type: docs
weight: 20
url: /nodejs-net/aspose.words.ai/iaimodeltext/summarize/
---

## summarize(sourceDocument, options) {#document_summarizeoptions}

Generates a summary of the specified document, with options to adjust the length of the summary.
This operation leverages the connected AI model for content processing.


```js
summarize(sourceDocument: Aspose.Words.Document, options: Aspose.Words.AI.SummarizeOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourceDocument | [Document](../../../aspose.words/document/) | The document to be summarized. |
| options | [SummarizeOptions](../../summarizeoptions/) | Optional settings to control the summary length and other parameters. |

### Returns

A summarized version of the document's content.


## summarize(sourceDocuments, options) {#document[]_summarizeoptions}

Generates summaries for an array of documents, with options to control the summary length and other settings.
This method utilizes the connected AI model for processing each document in the array.


```js
summarize(sourceDocuments: Aspose.Words.Document[], options: Aspose.Words.AI.SummarizeOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourceDocuments | [Document](../../../aspose.words/document/)[] | An array of documents to be summarized. |
| options | [SummarizeOptions](../../summarizeoptions/) | Optional settings to control the summary length and other parameters |

### Returns

A summarized version of the document's content.


## Examples

Shows how to summarize text using OpenAI and Google models.

```js
let firstDoc = new aw.Document(base.myDir + "Big document.docx");
let secondDoc = new aw.Document(base.myDir + "Document.docx");

const apiKey = process.env.API_KEY;
if (!apiKey) {
  console.warn("API_KEY environment variable is not set.");
  return;
}

// Use OpenAI or Google generative language models.
let model = aw.AI.AiModel.createGpt4OMini();
model.setApiKey(apiKey);
model.setOrganization("Organization");
model.setProject("Project");

let options = new aw.AI.SummarizeOptions();

options.summaryLength = aw.AI.SummaryLength.Short;
let oneDocumentSummary = model.summarize(firstDoc, options);
oneDocumentSummary.save(base.artifactsDir + "AI.AiSummarize.one.docx");

options.summaryLength = aw.AI.SummaryLength.Long;
let multiDocumentSummary = model.summarize([firstDoc, secondDoc], options);
multiDocumentSummary.save(base.artifactsDir + "AI.AiSummarize.multi.docx");
```

## See Also

* module [Aspose.Words.AI](../../)
* class [IAiModelText](../)

