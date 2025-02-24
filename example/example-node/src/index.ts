import express, {Application, Request, Response} from "express";

const app: Application = express();

app.use(express.json());
app.use(express.urlencoded({extended: true}));

app.use("/", (req: Request, res: Response) => {
    res.send("Hello, Express!");
});

app.use("/users", (req: Request, res: Response) => {
    res.send("Hello, Users!");
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`🚀 Server is running on http://localhost:${PORT}`);
});