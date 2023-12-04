let counter = 0;

function inception() {
  if (counter > 3) {
    console.log("done");
    return "done";
  }
  counter++;
  console.log("Not yet");
  return inception();
}

inception();
