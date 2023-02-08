### listforx

# Purpose

General purpose information repository. The idea is to store all kinds of information using a dynamic, extensible data structure.
<br>

All information comes organized in categories. e.g. news, food, sports results. This repository attempts to track all types of information in a consistent manner. The following json gives an illustration of a "record":
<br>

```
{
  "id": "a-unique-id",
  .
  .
  .
  .
  "protocol": "" // this is an encoded value which identifies the category of the data, among other things
}
```

Let us take an example to explain the concept. My small news agency needs a quick and easy way to archive news articles written by us.
I can harness *listforx* for this purpose. In order to do so, I can create a sample JSON for each article that looks like this:
```
{
  "id": "a-unique-id",
  "title": "Climate change summit begins today",
  "date": "2023-01-01 00:00:000",
  "link": "link-to-external-media.com/some-photo.jpg",
  "body": "It was a brisk cold day in Geneva...",
  .
  .
  "protocol": "[unique-identifier][date-for-order][title-is-for-search]"
}
```

Here, we see that for my purposes, I need the date to maintain order of articles, and, I will search my articles using title as the primary search.
All this information is captured in the unique protocol field.

The protocol has the following utility:
  - It groups data into categories. eg. articles by the Daily Bugle, or 5 Cedi recipes.
  - It can also be a way to sort the data. eg. by date, name, or even just numbering.
  - It is extensible. The protocol can adapted to fit whatever its creator sees fit.

Swagger docs link goes here: ->

