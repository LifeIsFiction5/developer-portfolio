import { Button } from "../components/ui/button"

export default function Home() {
    return (
        <div className="text-center space-y-6">
            <h1 className="text-4xl font-bold text-foreground mb-4">Welcome to Jake's Portfolio!</h1>
            <p className="text-lg text-muted-foreground">A developer passionate about creating amazing web experiences.</p>
            
            <div className="flex gap-4 justify-center">
                <Button>Get Started</Button>
                <Button variant="outline">Learn More</Button>
                <Button variant="secondary">Contact Me</Button>
            </div>
        </div>
    );
}